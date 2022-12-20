<center><h1><b>Documentación del Sistema "Colas Felices"</b></h1></center>
<center><h1><b>(Proyecto Final)</b></h1></center>

>## **Introducción**
<div style="text-align: justify"><h4>Este proyecto es un solucion de software escalable, el cual tiene como proposito principal gestionar de manera satisfactoria las actividades comerciales y/o transacciones  que realiza la tienda "Colas Felices". Tienda dedicada a la venta de mascotas cumpliendo con todas las políticas de animales, así como también, brindandole a las mascotas durante su estancia en la tienda la mejor calidad sanitaria posible.</h4></div>

<p><strong>Esta solución ha sido desarrollada por:</strong></p>

* Frank De Jesús **(2022-0618)** / Lider de Proyecto y DBA
* Jean De Los Santos **(2022-0442)** / SQA
* Omar Lora **(2022-0119)** / Diseño

>## **Requerimientos**
<div style="text-align: justify"><h4>Se requiere de una solución de software la cual contenga dos mantenimientos o entradas cuya base de datos sea implementada en el gestor <b>SQLite</b>. En ambos manteniemintos se debe poder realizar todas las funciones contenidas en un CRUD (Create-Update-Read-Delete) permitiendo:
<ul> 
<li>Crear</li>
<li>Modificar</li>
<li>Buscar</li>
<li>Listar</li>
<li>Eliminar</li>
</ul>
<p><b>De manera gráfica debe contener:</b></p>
<ul>
<li>Un login para acceder a la misma.</li>
<li>Un menú de opciones para utilizar cada uno de los mantenimientos.</li>
<li>Una opción para salir de la aplicación.</li>
<li>Una pantalla "acerca de", donde se hablara del software y su versión, además de contener una pequeño manual de usuario.
</li>
</ul>
</h4></div>

>## **Experiencia de usuario**

<h3><i><b>Login "Colas Felices"</b></i></h3>

![Login](https://snz04pap002files.storage.live.com/y4mE2mqHIotD6Iin2T97eheMta34fLgF_Ksiofg9YE26NWTKJu2we_f-06v4ez3VZtCE4Zl1EZSUCrVYrYkSnWT2nsoJil4s4155ftsj0JsO3YN-cJ_baFQsZa6AXIBoGYAmyRlCZe9b7CRIeQjJqO4LITWptGMNO9-RfJczRkVO2KdIpFVViNF1qkUpDyqrTPeL-B6d-FnZIa5z-o8qWgqiOIthBtQ2GTso0AP_vFmWjw?encodeFailures=1&width=801&height=597 "Login Colas Felices")

<div style="text-align: justify"><h4>Al iniciar la aplicación, lo primero en mostrarse es el login. En este iniciarán sesión los usuarios previamente registrados en la  base de datos de la tienda con su <b>usuario</b> y <b>contraseña</b> asignada.</h4>

<h4>En esta interfaz encontraremos a la izquierda el logo de la tienda y a la derecha los campos o entrada de datos en los cuales se ingresaran las credenciales correspondientes. En la parte inferior derecha encontraremos dos botones: <b>[Ingresar]</b> para acceder a la página principal de la aplicación luego de insertar nuestras credenciales correctamente. <b>[Salir]</b> para salir de la aplicación si ya no se quiere ingresar a ella.</h4></div>

<h3><i><b>Inicio de sesión incorrecto</b></i></h3>

![Incorrect_Login](https://snz04pap002files.storage.live.com/y4mntkUY1hLFXghUwOLCvGw_M0n7wL8Ph4KoNQZssskaNtqXAfl4__lj4g9Ehcb1oCAU2LD0-rneGFikSLuppnYLvabuLJQ9TsCOY2QAJdVCGdYz0CTgJHF26AGJnp39k4mbL9mKnHEcTyhZuTWywf96CkBhCSoqMDIsgkUVHp8Pon85s4XdvB0oV2JBnv2zdrsGP_o6WOm-y_9rlrde4Z6gcFrWP6VTHUPT4mAPKkkO2E?encodeFailures=1&width=795&height=593 "Mensaje de entrada incorrecta")

<div style="text-align: justify"><h4>El login verifica que las credenciales ingresadas estén registradas en la base de datos para poder dar acceso a los usuarios. Es por esto que, si algún usuario llega a ingresar alguna de sus credenciales de manera incorrecta el login mostrará un mensaje en pantalla notificandole al usuario que el usuario ingresado no se encuentra en la base de datos de la tienda.</h4>

<h4>Inmediatamente el usuario presiona <b>[OK]</b> los campos se limpian  para que este pueda ingresar sus credenciales nuevamente.</h4></div>

<h3><i><b>Inicio de sesión correcto</b></i></h3>

![Correct_Login](https://snz04pap002files.storage.live.com/y4mz4pgzdr_lU41k077Joiw03YSAAZTW-cFsZSru74Jojrp-N28gxKV1O3t2RN48zZEZArts8v9Z7FWv5tuo02Z9AVYNLPu-VBz9rPwXpPdmB1KiTKrcTQqUq0M9WAGzvqODVRmwoaoMJi2WCydtqLXEjQo9aA5-7IFJ3Sx3aum5qu-aOIZBwD5EuRJ6JGdyUQGSfVUrJFISCFfgZL4d1vKvZKtOqfmkLB2kgwylRcosyg?encodeFailures=1&width=798&height=598 "Mensaje de entrada correcta")

<div style="text-align: justify"><h4>Aquí, simplemente son validadas las credenciales ingresadas y como se encuentran en la base de datos de la tienda el login le da la bienvenida al usuario y procede a darle acceso.</h4></div>

<h3><i><b>Página Principal</b></i></h3>

![Home_page](https://snz04pap002files.storage.live.com/y4mNFt8Sk_u1Ky_AwHgjcKIgwJlXsVLYQeps6x0ALfClPgatIc-OU3iX_MNChehEaG0XR_L2huAUXoQIuyk9N3a6amV-oRVwlXSHFuuh0Gwpv-dR2Xtnv3B40onJ3oLWonXxM1ovQuXQ8yhgDOT4QfkYvRjuqe2wHLRPHF7y_9vA87jQ6_MGPYIGbTRHf-8vLlw9eWbKcP1zlTHJZ_sK1FrZ07uBy6JtU5D3coMxpj0sEk?encodeFailures=1&width=1066&height=609 "Página principal")

<div style="text-align: justify"><h4>Al ingresar a la aplicación se muestra la ventana principal en la cual encontramos  un menú de navegación bastante intuitivo y fácil de usar en la parte superior izquiera que consta de tres botones: <b>[Salir]</b> para salir completamente de la aplicación desde la página principal, <b>[Cerrar sesión]</b> para salir de la cuenta con la que se ingresó y poder ingresar con otra cuenta distinta si se desea, ya que al salir de la cuenta el usuario es redirigido al Login nuevamente, <b>[Acerca]</b> para redirigir al usuario a la pagina "Acerca de" y mostrar al usuario información sobre los desarrolladores de dicha aplicación, la versión de la aplicación y el año en que fue desarrollada.</h4>

<h4>En la parte superior central encontramos dos botones: <b>[Empleados]</b> para rediridir hacia el primer mantenimiento o entrada de empleados y <b>[Mascotas]</b> para redirigir al segundo mantenimiento o entrada de mascotas</h4></div>

<h3><i><b>Primer Mantenimiento</b></i></h3>

![First_input](https://snz04pap002files.storage.live.com/y4mhaCr-KfC_yNVluVgkOTbr3KH11Tw1v-cHkf8YZlWLh3RBLZ7JgFTDSdroLU-LUZLYQ_d-13IiMDUWHzRY56_cYb6P5sdnAEI09-2yG4r7RgIosXGgCdr22x7RTer81F5xrcFgBKMJDZPUC99VeRqDJ6-ezx1tNp0pMHdabcGHC9CvIuhHGFBaxckBr2FjeUNVPeo2wk6M0LfKm5zGlinnV0b_UjRxPmfYAq6wzxQlnQ?encodeFailures=1&width=869&height=609 "Primera Entrada")

<div style="text-align: justify"><h4>Al ingresar solo están habilitados en toda la parte inferior los botones <b>[Nuevo]</b> para agregar todos los empleados que se deseen luego de rellenar todos los campos que se solicitan en la parte superior y <b>[Regresar]</b> para salir de la ventana "Registro de Empleados" y redirigir al usuario a la página principal. A su vez, se muestra un registro en forma de tabla con todos los empleados registrados</h4></div>

<h3><i><b>Modificar primer Mantenimiento</b></i></h3>

![Modify_First_input](https://snz04pap002files.storage.live.com/y4maUer8krwarBqYUPUYN0bMQewlppTGKTr1WKYDQXKOth1bZNm96I_PkzC3ZP0RPjV7sXvHnSN16jPqSP4_00hi3xdX1USeNobZ5--UIm9lsIYF_7pWPv7x6WvFPtCzwFclbYfurAiS6G3_jRgXF0yfBzeaAMW1BrW14AW5mS_bE2TIQ1-5JhrG8HPOyCY6UJJLda15YDyxqMuOwpoc8qLne__ia3PXBaIe-EBzBDGPhY?encodeFailures=1&width=860&height=609 "Modificar Primera Entrada")

<div style="text-align: justify"><h4>Al presionar cualquier registro se cargan los datos en su respectivo campo en la parte superior y se habilitan todos los demás botones de la barra inferior: <b>[Guardar]</b> para guardar cualquier cambio realizado y actualizar los registros, <b>[Eliminar]</b> para borrar de la base de datos el registro del empleado seleccionado, <b>[Cancelar]</b> para desmarcar el registro seleccionado y/o cancelar los cambios realizados a dicho registro.</h4></div>

<h3><i><b>Filtro primer Mantenimiento</b></i></h3>

![Filter_First_input](https://snz04pap002files.storage.live.com/y4mWKAIoxC-zTN2iu_KrIpd4MK959Bbs14DbKVXcxGibbbEG-_n_BOTHffgi_XH8pRYeREAhk6YHUSry5Ur_Pz4YD0dFj2FqdyDyVy9wbvQrqHs9lKnaA8_JaCGcc_0Gextw8IjQJj1FgZ5UoZ_gT2c5x4tAUVhH6-xgdrvVI5aa9XA0uli4FiKSzIL16Uor3hWTfu944Iqivd93rtcrQ552_ywNn8NgqGSgkrq7evZwYA?encodeFailures=1&width=873&height=609 "Filtro Primera Entrada")

<div style="text-align: justify"><h4>La última funcionalidad que esta interfaz tiene es la de filtrar por el campo de nombre a los empleados dentro de todos los registros. También, consta con un botón en forma de escoba al lado para limpiar la barra de busqueda.</h4></div>

<h3><i><b>Segundo Mantenimiento</b></i></h3>

![Second_input](https://snz04pap002files.storage.live.com/y4m08zCaafqcugcqk9e9Ed10cdqs0HNvBVMswJjRGyP-wyTJefmgorhC8irNbSIcFK0dDwe0OoNzieGzMwBAdb88QgG1VZOhirUp5LTG7hzS-Uyi6DMHwaLTNgxjkeKZafSdRfjmmOP2wPLQoNeJaweWEb8FWBGPVz9EkuzlEfnz953j4mQ_RugNm9DsWGs4AbI-v_ZOBOTGSM9lHYtlSxYXfg_i6PzevD8cQooedAtQbk?encodeFailures=1&width=959&height=609 "Segunda Entrada")

<div style="text-align: justify"><h4>Al ingresar solo están habilitados en toda la parte inferior los botones <b>[Nuevo]</b> para agregar todas las mascotas que se deseen luego de rellenar todos los campos que se solicitan en la parte superior y <b>[Regresar]</b> para salir de la ventana "Mascotas" y redirigir al usuario a la página principal. A su vez, se muestra un registro en forma de tabla con todas las mascotas registradas.</h4></div>

<h3><i><b>Modificar segundo Mantenimiento</b></i></h3>

![Modify_Second_input](https://snz04pap002files.storage.live.com/y4mXS2M5vBQ5YQkiJDt5GvM1ENWYlmjH7mNOAq_j_stOnzCrc_JYSJUagZ_r0Jl-cyxzx5xzY9WT6lkOpTju3h2Op5TQl1NUEp-3UBgVeLrKxiWW4ZjJ4vu38XZDs4ZmR09LQVF4AE9ifP-7NLhOCKzZUD_nglZIy5RFNm86vv2GlvrwVlEoTwRJroAuPG8ts-_G9d5tkVXNVhsfPhUE0PR3JNCONm5ulMK1IVjfylY_Qs?encodeFailures=1&width=955&height=609 "Modificar segunda Entrada")

<div style="text-align: justify"><h4>Al presionar cualquier registro se cargan los datos en su respectivo campo en la parte superior y se habilitan todos los demás botones de la barra inferior: <b>[Guardar]</b> para guardar cualquier cambio realizado y actualizar los registros, <b>[Eliminar]</b> para borrar de la base de datos el registro de la mascota seleccionada, <b>[Cancelar]</b> para desmarcar el registro seleccionado y/o cancelar los cambios realizados a dicho registro.</h4></div>

<h3><i><b>Filtro segundo Mantenimiento</b></i></h3>

![Filter_Second_input](https://snz04pap002files.storage.live.com/y4mfOVN-4RE7w-oSkUsQSbS4fMTCJn3nZOMQUV99IuR1etUqjhj8Q3k1UHg3qcAUnDkTTOc6mAhAtkrU1z3W6nLyl7TW_4e8oyMxR7FIcosDoVOLF-tyM6DEij9VmDhjV5gjnq0HXeff3nHHTwLV4zFWLyKVXUd9BXcxv1rVj-_paUlGRM-MarbEAdbuGehsZfe_7XIhm6Prkhvf5MKH_mL5TXiquMe3kI9OdRJHj8G1Gw?encodeFailures=1&width=951&height=609 "Filtro Segunda Entrada")

<div style="text-align: justify"><h4>La última funcionalidad que esta interfaz tiene es la de filtrar por el campo de Raza a las mascotas dentro de todos los registros. También, consta con un botón en forma de escoba al lado para limpiar la barra de busqueda.</h4></div>

<h3><i><b>Ventana "Acerca de"</b></i></h3>

![About_us](https://snz04pap002files.storage.live.com/y4mQnmm79yi8q_pNiGPrRpe4kT-7a9WD3hDwzX-B2KMbam0PpwW0DhprPCFuAyXyNanC1Nq9mo4MRe2JKosacqar5IXZ7GLC6bQE3EZq-fOslt_GKuNTBbqkA2IrUhkkeP1s8az3_89iWOaq_pF_lBWXNBrbrErFpeWFxzyJC2_8sdfmI6r1JA-7fx0Uia4I7Jg7OrCzkpDiiDQ5JP3wjPiBJthlVVNbR61rB48h_jQXIY?encodeFailures=1&width=623&height=609 "Acerca de")

<div style="text-align: justify"><h4>En esta ventana se le muestra a todos los usuarios todas las informaciones acerca de las personas encargadas del desarrollo de dicha aplicación, la versión actual en la que se encuentra la aplicación, y el año en que fue desarrollada.</h4></div>
