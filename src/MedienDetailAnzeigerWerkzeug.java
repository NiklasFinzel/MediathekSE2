import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Ein MedienDetailAnzeigerWerkzeug ist ein Werkzeug um die Details von Medien
 * anzuzeigen.
 * 
 * @author SE2-Team
 * @version SoSe 2017
 */
class MedienDetailAnzeigerWerkzeug
{
    private MedienDetailAnzeigerUI _ui;

    /**
     * Initialisiert ein neues MedienDetailAnzeigerWerkzeug.
     */
    public MedienDetailAnzeigerWerkzeug()
    {
        _ui = new MedienDetailAnzeigerUI();
    }

    /**
     * Setzt die Liste der Medien deren Details angezeigt werden sollen.
     * 
     * @param medien Eine Liste von Medien.
     * 
     * @require (medien != null)
     */
    public void setMedien(List<Medium> medien)
    //setMedien nach 3.2.1
    {
        assert medien != null : "Vorbedingung verletzt: (medien != null)";
        JTextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
        String textArea = "";
           
        DVD dvd;
        CD cd;
        Videospiel videospiel;
        
        for(Medium medium:medien){

        	if(medium instanceof DVD){
        		dvd = (DVD) medium;
        		textArea += dvd.getMedienBezeichnung() + ", " + dvd.getTitel() + ", " + dvd.getKommentar() + ", " + dvd.getRegisseur() + ", " + dvd.getLaufzeit() + "\n";
 
        	}
        	else if(medium instanceof CD){
        		cd = (CD) medium;
        		textArea += cd.getMedienBezeichnung() + ", " + cd.getTitel() + ", " + cd.getKommentar() + ", " + cd.getInterpret() + ", " + cd.getSpiellaenge() + "\n";
        		
        	}
        	else if(medium instanceof Videospiel){
        		videospiel = (Videospiel) medium;
        		textArea += videospiel.getMedienBezeichnung() + ", " + videospiel.getTitel() + ", " + videospiel.getKommentar() + ", " + videospiel.getSystem() + "\n";
        	}
        }
        selectedMedienTextArea.setText(textArea);
    }
//	public void setMedien(List<Medium> medien)
//	// setMedien nach 3.2.2. Methode makieren und dann Strg+7 fürs auskommentieren
//	{
//		assert medien != null : "Vorbedingung verletzt: (medien != null)";
//		JTextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
//		String textArea = "";
//
//		for (Medium medium : medien) {
//			textArea += medium.getFormatiertenString();
//		}
//        		
//       
//        selectedMedienTextArea.setText(textArea);
//    }

    /**
     * Gibt das Panel dieses Subwerkzeugs zurück.
     * 
     * @ensure result != null
     */
    public JPanel getUIPanel()
    {
        return _ui.getUIPanel();
    }
}
