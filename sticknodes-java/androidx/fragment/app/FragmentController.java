package androidx.fragment.app;

/* loaded from: classes.dex */
public class FragmentController {
    private final androidx.fragment.app.FragmentHostCallback<?> mHost;

    private FragmentController(androidx.fragment.app.FragmentHostCallback<?> r1) {
            r0 = this;
            r0.<init>()
            r0.mHost = r1
            return
    }

    public static androidx.fragment.app.FragmentController createController(androidx.fragment.app.FragmentHostCallback<?> r2) {
            androidx.fragment.app.FragmentController r0 = new androidx.fragment.app.FragmentController
            java.lang.String r1 = "callbacks == null"
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2, r1)
            androidx.fragment.app.FragmentHostCallback r2 = (androidx.fragment.app.FragmentHostCallback) r2
            r0.<init>(r2)
            return r0
    }

    public void attachHost(androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            androidx.fragment.app.FragmentManager r1 = r0.mFragmentManager
            r1.attachController(r0, r0, r3)
            return
    }

    public void dispatchActivityCreated() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.dispatchActivityCreated()
            return
    }

    public boolean dispatchContextItemSelected(android.view.MenuItem r2) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            boolean r2 = r0.dispatchContextItemSelected(r2)
            return r2
    }

    public void dispatchCreate() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.dispatchCreate()
            return
    }

    public void dispatchDestroy() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.dispatchDestroy()
            return
    }

    public void dispatchPause() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.dispatchPause()
            return
    }

    public void dispatchResume() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.dispatchResume()
            return
    }

    public void dispatchStart() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.dispatchStart()
            return
    }

    public void dispatchStop() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.dispatchStop()
            return
    }

    public boolean execPendingActions() {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r1 = 1
            boolean r0 = r0.execPendingActions(r1)
            return r0
    }

    public androidx.fragment.app.FragmentManager getSupportFragmentManager() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            return r0
    }

    public void noteStateNotSaved() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            r0.noteStateNotSaved()
            return
    }

    public android.view.View onCreateView(android.view.View r2, java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            android.view.LayoutInflater$Factory2 r0 = r0.getLayoutInflaterFactory()
            android.view.View r2 = r0.onCreateView(r2, r3, r4, r5)
            return r2
    }
}
