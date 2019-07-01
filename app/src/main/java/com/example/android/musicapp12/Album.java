package com.example.android.musicapp12;

/**
 * Created by Paula on 6/27/2019.
 */

public class Album {

    /**Album name */
    private String mAlbumTranslation;

    /** Artist name */
    private String mArtistTranslation;

    /**
     * Create a new Album object.
     *
     * @param albumTranslation is the word in the language that the user is already familiar with
     *                            (such as English)
     * @param artistTranslation is the word in the Miwok language
     */

    public Album(String albumTranslation, String artistTranslation){
        mAlbumTranslation = albumTranslation;
        mArtistTranslation = artistTranslation;
    }
    /**
     * Get the default translation of the word.
     */
    public String getAlbumTranslation() {
        return mAlbumTranslation;
    }
    /**
     * Get the Miwok translation of the word.
     */
    public String getArtistTranslation() {
        return mArtistTranslation;
    }
}
