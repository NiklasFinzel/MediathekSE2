/**
 * Eine {@link Videospiel} ist ein Medium. Zusätzlich zu den Eigenschaften eines
 * {@link Medium}s erfasst sie Informationen zum System.
 * 
 * @author Niklas Finzel
 * @version SoSe 2017
 * 
 */
class Videospiel implements Medium
{

    /**
     * Ein Kommentar zum Medium
     */
    private String _kommentar;

    /**
     * Der Titel des Mediums
     * 
     */
    private String _titel;
    
    /**
     * Das System des Videospiels
     */
    private String _system;

    /**
     * Initialisiert ein neues Videospiel mit den gegebenen Daten.
     * 
     * @param titel Der Titel des Videospiels.
     * @param kommentar Ein Kommentar zum Videospiel.
     * @param system Das System des Videospiels
     * 
     * @require titel != null
     * @require kommentar != null
     * @require system != null
     * 
     * @ensure getTitel() == titel
     * @ensure getKommentar() == kommentar
     * @ensure getSystem() == system
     */
    public Videospiel(String titel, String kommentar, String system)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        assert system != null : "Vorbedingung verletzt: system != null";
        _titel = titel;
        _kommentar = kommentar;
        _system = system;
    }

    @Override
    public String getMedienBezeichnung()
    {
        return "Videospiel";
    }

    /**
     * Gibt das System des Videospiels zurück
     * 
     * @return Das System des Videospiels
     * 
     * @ensure result != null
     */
    public String getSystem()
    {
        return _system;
    }

    @Override
    public String getKommentar()
    {
        return _kommentar;
    }

    @Override
    public String getTitel()
    {
        return _titel;
    }
    
    @Override
    public String getFormatiertenString()
    {
    	return "Videospiel" + ", " + _titel + ", " + _kommentar + ", " + _system + "\n";
    }

}