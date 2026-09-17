package androidx.core.view;

/* loaded from: classes.dex */
public interface MenuProvider {
    void onCreateMenu(android.view.Menu r1, android.view.MenuInflater r2);

    void onMenuClosed(android.view.Menu r1);

    boolean onMenuItemSelected(android.view.MenuItem r1);

    void onPrepareMenu(android.view.Menu r1);
}
