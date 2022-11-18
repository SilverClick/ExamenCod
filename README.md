# examenDAM
Para utilizarlo en el examen
Estos son los pasos a realizar en el examen:
Para el primer ejercicio lo que tenemos que hacer es copiar el enlace del repositorio
que queremos clonar y una vez hecho esto vamos al terminal y usamos git clone con el enlace
para clonarlo.
Para el segundo ejercicio tenemos que ir a github, darle a crear repositorio y darle a privado, después de esto debemos
modificar el Readme que podemos hacerlo desde el propio IDE de Intellij y hacer un git add Readme.md para cuando lo subamos solo 
subir el Readme, hacemos un commit yendo a la terminal y haciendo git commit -m "comentario" para tener nuestro primer commit 
con un comentario gracias al -m y para subirlo debemos cambiar el repositorio dado que al clonar un repositorio si solo hicieramos git push para 
intentar subir el commit no nos dejaria ya que el repositorio original no es nuestro por lo que debemos hacer
git remote set-url origin url de nuestro repositorio para así cambiar el lugar al que va a ir el commit, una vez hecho esto
cambiamos a main todo con un git branch main y por último git push origin main
para subir el commit.