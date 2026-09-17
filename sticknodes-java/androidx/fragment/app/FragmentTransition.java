package androidx.fragment.app;

/* loaded from: classes.dex */
class FragmentTransition {
    static final androidx.fragment.app.FragmentTransitionImpl PLATFORM_IMPL = null;
    static final androidx.fragment.app.FragmentTransitionImpl SUPPORT_IMPL = null;

    static {
            androidx.fragment.app.FragmentTransitionCompat21 r0 = new androidx.fragment.app.FragmentTransitionCompat21
            r0.<init>()
            androidx.fragment.app.FragmentTransition.PLATFORM_IMPL = r0
            androidx.fragment.app.FragmentTransitionImpl r0 = resolveSupportImpl()
            androidx.fragment.app.FragmentTransition.SUPPORT_IMPL = r0
            return
    }

    static void callSharedElementStartEnd(androidx.fragment.app.Fragment r0, androidx.fragment.app.Fragment r1, boolean r2, androidx.collection.ArrayMap<java.lang.String, android.view.View> r3, boolean r4) {
            if (r2 == 0) goto L6
            r1.getEnterTransitionCallback()
            goto L9
        L6:
            r0.getEnterTransitionCallback()
        L9:
            return
    }

    private static androidx.fragment.app.FragmentTransitionImpl resolveSupportImpl() {
            java.lang.String r0 = "androidx.transition.FragmentTransitionSupport"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L16
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L16
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L16
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L16
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L16
            androidx.fragment.app.FragmentTransitionImpl r0 = (androidx.fragment.app.FragmentTransitionImpl) r0     // Catch: java.lang.Exception -> L16
            return r0
        L16:
            r0 = 0
            return r0
    }

    static void retainValues(androidx.collection.ArrayMap<java.lang.String, java.lang.String> r2, androidx.collection.ArrayMap<java.lang.String, android.view.View> r3) {
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L1a
            java.lang.Object r1 = r2.valueAt(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r3.containsKey(r1)
            if (r1 != 0) goto L17
            r2.removeAt(r0)
        L17:
            int r0 = r0 + (-1)
            goto L6
        L1a:
            return
    }

    static void setViewVisibility(java.util.ArrayList<android.view.View> r2, int r3) {
            if (r2 != 0) goto L3
            return
        L3:
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L9:
            if (r0 < 0) goto L17
            java.lang.Object r1 = r2.get(r0)
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r3)
            int r0 = r0 + (-1)
            goto L9
        L17:
            return
    }
}
