package org.musicbrainz.mobile.activity.base;


import android.app.Dialog;

public abstract class DataQueryActivity extends MusicBrainzActivity {

    protected static final int DIALOG_CONNECTION_FAILURE = 2;
    
    protected abstract Dialog createConnectionErrorDialog();
    
    @Override 
    protected Dialog onCreateDialog(int id) {
        switch (id) {
        case DIALOG_CONNECTION_FAILURE:
            return createConnectionErrorDialog();
        }
        return null;
    }
    
    public abstract void onTaskFinished();
    
}
