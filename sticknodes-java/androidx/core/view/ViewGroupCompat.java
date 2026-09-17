package androidx.core.view;

/* loaded from: classes.dex */
public final class ViewGroupCompat {

    static class Api21Impl {
        static int getNestedScrollAxes(android.view.ViewGroup r0) {
                int r0 = r0.getNestedScrollAxes()
                return r0
        }

        static boolean isTransitionGroup(android.view.ViewGroup r0) {
                boolean r0 = r0.isTransitionGroup()
                return r0
        }

        static void setTransitionGroup(android.view.ViewGroup r0, boolean r1) {
                r0.setTransitionGroup(r1)
                return
        }
    }

    public static boolean isTransitionGroup(android.view.ViewGroup r0) {
            boolean r0 = androidx.core.view.ViewGroupCompat.Api21Impl.isTransitionGroup(r0)
            return r0
    }
}
