package androidx.loader.app;

/* loaded from: classes.dex */
public abstract class LoaderManager {

    public interface LoaderCallbacks<D> {
        androidx.loader.content.Loader<D> onCreateLoader(int r1, android.os.Bundle r2);

        void onLoadFinished(androidx.loader.content.Loader<D> r1, D r2);

        void onLoaderReset(androidx.loader.content.Loader<D> r1);
    }

    public LoaderManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T extends androidx.lifecycle.LifecycleOwner & androidx.lifecycle.ViewModelStoreOwner> androidx.loader.app.LoaderManager getInstance(T r2) {
            androidx.loader.app.LoaderManagerImpl r0 = new androidx.loader.app.LoaderManagerImpl
            r1 = r2
            androidx.lifecycle.ViewModelStoreOwner r1 = (androidx.lifecycle.ViewModelStoreOwner) r1
            androidx.lifecycle.ViewModelStore r1 = r1.getViewModelStore()
            r0.<init>(r2, r1)
            return r0
    }

    @java.lang.Deprecated
    public abstract void dump(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4);

    public abstract <D> androidx.loader.content.Loader<D> initLoader(int r1, android.os.Bundle r2, androidx.loader.app.LoaderManager.LoaderCallbacks<D> r3);

    public abstract void markForRedelivery();
}
