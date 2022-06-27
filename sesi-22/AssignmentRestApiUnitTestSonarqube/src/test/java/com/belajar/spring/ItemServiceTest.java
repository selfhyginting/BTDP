package com.belajar.spring;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import static org.mockito.Mockito.times;

import com.belajar.spring.entity.Item;
import com.belajar.spring.repository.ItemRepository;
import com.belajar.spring.service.ItemService;
import com.belajar.spring.service.impl.ItemServiceImpl;


@RunWith(SpringRunner.class)
public class ItemServiceTest {
	
	@InjectMocks
	private ItemService itemService = new ItemServiceImpl();

	@Mock
	private ItemRepository itemRepository;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		ReflectionTestUtils.setField(itemService, "itemRepository", itemRepository);
	}

	@Test
	public void testFindAll() {

		final List<Item> datas = TestObjectFactory.createItemList(10);
		Mockito.when(itemRepository.findAll()).thenReturn(datas);

		final List<Item> actual = itemService.findAllItem();
		MatcherAssert.assertThat(actual.size(), Matchers.equalTo(datas.size()));
	}

	@Test
	public void testItemById() throws Exception {

		final int id = new Random().nextInt();
		final Item item = TestObjectFactory.createItem();
		Mockito.when(itemRepository.findById(id)).thenReturn(Optional.of(item));

		final Item actual = itemService.findByIdItem(id);
		MatcherAssert.assertThat(actual.getId(), Matchers.equalTo(item.getId()));
		MatcherAssert.assertThat(actual.getNama(), Matchers.equalTo(item.getNama()));
		MatcherAssert.assertThat(actual.getHargaBeli(), Matchers.equalTo(item.getHargaBeli()));
		MatcherAssert.assertThat(actual.getHargaJual(), Matchers.equalTo(item.getHargaJual()));
	}

	@Test
	public void testItemByIdWithNullDataFromDB() throws Exception {
		final int id = new Random().nextInt();

		Mockito.when(itemRepository.findById(id)).thenReturn(Optional.empty());
		final Item actual = itemService.findByIdItem(id);
		MatcherAssert.assertThat(actual, Matchers.notNullValue());
	}

	@Test
	public void testSaveUpdateItem() {
		final Item item = TestObjectFactory.createItem();
		Mockito.when(itemRepository.save(item)).thenReturn(item);

		final Item actual = itemService.saveItem(item);
		MatcherAssert.assertThat(actual, Matchers.notNullValue());
	}

	@Test
	public void testDeleteItem() {
		final int id = new Random().nextInt();
		Item item = TestObjectFactory.createItem();

		Mockito.when(itemRepository.findById(id)).thenReturn(Optional.of(item));
		Mockito.doNothing().when(itemRepository).delete(item);
		itemService.deleteItem(id);

		Mockito.verify(itemRepository, times(1)).delete(item);
	}

}
