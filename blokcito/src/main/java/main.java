import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {
    private JPanel panel1;
    private JTabbedPane tabbedPane1;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Blokcito");
        frame.setContentPane(new main().panel1);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);
        JMenuBar mb = new JMenuBar();
        frame.setJMenuBar(mb);
        JMenu menuArchivo = new JMenu("Archivo");
        JMenu menuEdicion = new JMenu("Edicion");
        JMenu menuFormato = new JMenu("Formato");
        JMenu menuAccesibilidad = new JMenu("Accesibilidad");
        JMenu menuAyuda = new JMenu("Ayuda");
        mb.add(menuArchivo);
        mb.add(menuEdicion);
        mb.add(menuFormato);
        mb.add(menuAccesibilidad);
        mb.add(menuAyuda);
        //Archivo:
        JMenuItem miNuevo=new JMenuItem("Nuevo");
        miNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuArchivo.add(miNuevo);
        JMenuItem miAbrir=new JMenuItem("Abrir");
        miAbrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuArchivo.add(miAbrir);
        JMenuItem miGuardar=new JMenuItem("Guardar");
        miGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuArchivo.add(miGuardar);
        JMenuItem miGuardarComo=new JMenuItem("Guardar Como");
        miGuardarComo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuArchivo.add(miGuardarComo);
        JMenuItem miExportarPDF=new JMenuItem("Exportar a PDF");
        miExportarPDF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuArchivo.add(miExportarPDF);
        JMenuItem miCerrarArchivo=new JMenuItem("Cerrar Archivo");
        miCerrarArchivo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuArchivo.add(miCerrarArchivo);
        JMenuItem miCerrar=new JMenuItem("Cerrar");
        miCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuArchivo.add(miCerrar);
        //Edición:
        JMenuItem miCortar = new JMenuItem("Cortar");
        miCortar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuEdicion.add(miCortar);
        JMenuItem miCopiar = new JMenuItem("Copiar");
        miCopiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        }
        });
        menuEdicion.add(miCopiar);
        JMenuItem miPegar = new JMenuItem("Pegar");
        miPegar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuEdicion.add(miPegar);
        JMenuItem miBuscar = new JMenuItem("Buscar");
        miBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuEdicion.add(miBuscar);
        JMenuItem miInsertarFecha = new JMenuItem("Insertar Fecha");
        miInsertarFecha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuEdicion.add(miInsertarFecha);
        JMenuItem miInsertarFechaHora = new JMenuItem("Insertar Fecha y Hora");
        miInsertarFechaHora.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuEdicion.add(miInsertarFechaHora);
        JMenuItem miInsertarImagen = new JMenuItem("Insertar Imagen");
        miInsertarImagen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuEdicion.add(miInsertarImagen);
        JMenuItem miInsertarTabla = new JMenuItem("Insertar Tabla");
        miInsertarTabla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuEdicion.add(miInsertarTabla);
        //Formato:
        JMenuItem miNegrita = new JMenuItem("Negrita");
        miNegrita.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuFormato.add(miNegrita);
        JMenuItem miCursiva = new JMenuItem("Cursiva");
        miCursiva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuFormato.add(miCursiva);
        JMenuItem miSubrayado = new JMenuItem("Subrayado");
        miSubrayado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuFormato.add(miSubrayado);
        JMenuItem miColor = new JMenuItem("Color de Texto");
        miColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuFormato.add(miColor);
        JMenuItem miResaltar = new JMenuItem("Resaltar Texto");
        miResaltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuFormato.add(miResaltar);
        JMenuItem miVinietas = new JMenuItem("Viñetas");
        miVinietas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuFormato.add(miVinietas);
        JMenuItem miTamanio = new JMenuItem("Tamaño del Texto");
        miTamanio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuFormato.add(miTamanio);
        JMenuItem miFuente = new JMenuItem("Fuente");
        miFuente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuFormato.add(miFuente);
        JMenuItem miAlinearDerecha = new JMenuItem("Alinear Derecha");
        miAlinearDerecha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuFormato.add(miAlinearDerecha);
        JMenuItem miAlinearIzquierda = new JMenuItem("Alinear Izquierda");
        miAlinearIzquierda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuFormato.add(miAlinearIzquierda);
        JMenuItem miAlinearCentro = new JMenuItem("Alinear Centro");
        miAlinearCentro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuFormato.add(miAlinearCentro);
        JMenuItem miAlinearJustificado = new JMenuItem("Alinear Justificado");
        miAlinearJustificado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuFormato.add(miAlinearJustificado);
        //Accesibilidad:
        JMenuItem miLeer = new JMenuItem("Leer");
        miLeer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuAccesibilidad.add(miLeer);
        JMenuItem miDictar = new JMenuItem("Dictar");
        miDictar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuAccesibilidad.add(miDictar);
        //Ayuda:
        JMenuItem miAyuda = new JMenuItem("Ayuda");
        miAyuda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuAyuda.add(miAyuda);
        JMenuItem miAcercaDe = new JMenuItem("Acerca de");
        miAcercaDe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuAyuda.add(miAcercaDe);
    }
}

