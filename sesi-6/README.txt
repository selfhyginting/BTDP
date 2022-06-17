Version Control System (VCS) berfungsi untuk melakukan control version pada project yang akan dikembangkan. 
Salah satu produknya adalah Git.

Untuk dapat melakukan remote project ataupun kolaborasi maka kita dapat menggunakan GitHub. Project akan ditempatkan di repository milik GitHub 
yang dapat diakses secara remote.

Install Git :
- Download installer pada https://git-scm.com/
- Install file .exe yang telah didownload.
- Kita dapat melihat git sudah berhasil diinstalasi atau belum dengan ketik pada commandprompt/gitbash : git --version

Register GitHub:
- Kunjungi https://github.com dan silahkan daftarkan akun.
- Untuk melakukan project remote, silahkan terlebih dahulu membuat repository pada GitHub lalu ikuti instruksi yang tersedia. 
- Kita dapat menambahkan git remote pada local project dengan : git remote add origin https://github.com/selfhyginting/namaRepository.git

Git config :
- Konfigurasikan global pada cmd
- git config --global user.name "selfhyginting"
- git config --global user.email user@email.com
- git config --list untuk melihat user yang telah berhasil diconfig

Git initialize --> push :
- git init
- git add .
- git status
- git commit -m ‘your message’
- git remote add origin ‘your_url_name’
- git push -u origin master