package androidx.fragment.app;

/* compiled from: FragmentContainerView.kt */
/* loaded from: classes.dex */
public final class FragmentContainerView extends android.widget.FrameLayout {
    private android.view.View.OnApplyWindowInsetsListener applyWindowInsetsListener;
    private final java.util.List<android.view.View> disappearingFragmentChildren;
    private boolean drawDisappearingViewsFirst;
    private final java.util.List<android.view.View> transitioningFragmentViews;

    /* compiled from: FragmentContainerView.kt */
    public static final class Api20Impl {
        public static final androidx.fragment.app.FragmentContainerView.Api20Impl INSTANCE = null;

        static {
                androidx.fragment.app.FragmentContainerView$Api20Impl r0 = new androidx.fragment.app.FragmentContainerView$Api20Impl
                r0.<init>()
                androidx.fragment.app.FragmentContainerView.Api20Impl.INSTANCE = r0
                return
        }

        private Api20Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public final android.view.WindowInsets onApplyWindowInsets(android.view.View.OnApplyWindowInsetsListener r2, android.view.View r3, android.view.WindowInsets r4) {
                r1 = this;
                java.lang.String r0 = "onApplyWindowInsetsListener"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "v"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "insets"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                android.view.WindowInsets r2 = r2.onApplyWindowInsets(r3, r4)
                java.lang.String r3 = "onApplyWindowInsetsListe…lyWindowInsets(v, insets)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                return r2
        }
    }

    public FragmentContainerView(android.content.Context r6, android.util.AttributeSet r7, androidx.fragment.app.FragmentManager r8) {
            r5 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "attrs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "fm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5.<init>(r6, r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.disappearingFragmentChildren = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.transitioningFragmentViews = r0
            r0 = 1
            r5.drawDisappearingViewsFirst = r0
            java.lang.String r1 = r7.getClassAttribute()
            int[] r2 = androidx.fragment.R$styleable.FragmentContainerView
            java.lang.String r3 = "FragmentContainerView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r3 = 0
            android.content.res.TypedArray r2 = r6.obtainStyledAttributes(r7, r2, r3, r3)
            if (r1 != 0) goto L3b
            int r1 = androidx.fragment.R$styleable.FragmentContainerView_android_name
            java.lang.String r1 = r2.getString(r1)
        L3b:
            int r3 = androidx.fragment.R$styleable.FragmentContainerView_android_tag
            java.lang.String r3 = r2.getString(r3)
            r2.recycle()
            int r2 = r5.getId()
            androidx.fragment.app.Fragment r4 = r8.findFragmentById(r2)
            if (r1 == 0) goto La7
            if (r4 != 0) goto La7
            r4 = -1
            if (r2 != r4) goto L83
            if (r3 == 0) goto L67
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = " with tag "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            goto L69
        L67:
            java.lang.String r6 = ""
        L69:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "FragmentContainerView must have an android:id to add Fragment "
            r8.append(r0)
            r8.append(r1)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        L83:
            androidx.fragment.app.FragmentFactory r2 = r8.getFragmentFactory()
            java.lang.ClassLoader r4 = r6.getClassLoader()
            androidx.fragment.app.Fragment r1 = r2.instantiate(r4, r1)
            java.lang.String r2 = "fm.fragmentFactory.insta…ontext.classLoader, name)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r2 = 0
            r1.onInflate(r6, r7, r2)
            androidx.fragment.app.FragmentTransaction r6 = r8.beginTransaction()
            androidx.fragment.app.FragmentTransaction r6 = r6.setReorderingAllowed(r0)
            androidx.fragment.app.FragmentTransaction r6 = r6.add(r5, r1, r3)
            r6.commitNowAllowingStateLoss()
        La7:
            r8.onContainerAvailable(r5)
            return
    }

    private final void addDisappearingFragmentView(android.view.View r2) {
            r1 = this;
            java.util.List<android.view.View> r0 = r1.transitioningFragmentViews
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto Ld
            java.util.List<android.view.View> r0 = r1.disappearingFragmentChildren
            r0.add(r2)
        Ld:
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.fragment.app.Fragment r0 = androidx.fragment.app.FragmentManager.getViewFragment(r2)
            if (r0 == 0) goto Lf
            super.addView(r2, r3, r4)
            return
        Lf:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Views added to a FragmentContainerView must be associated with a Fragment. View "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " is not associated with a Fragment."
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // android.view.ViewGroup, android.view.View
    public android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets r5) {
            r4 = this;
            java.lang.String r0 = "insets"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r5)
            java.lang.String r1 = "toWindowInsetsCompat(insets)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.view.View$OnApplyWindowInsetsListener r1 = r4.applyWindowInsetsListener
            if (r1 == 0) goto L20
            androidx.fragment.app.FragmentContainerView$Api20Impl r0 = androidx.fragment.app.FragmentContainerView.Api20Impl.INSTANCE
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            android.view.WindowInsets r0 = r0.onApplyWindowInsets(r1, r4, r5)
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
            goto L24
        L20:
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.ViewCompat.onApplyWindowInsets(r4, r0)
        L24:
            java.lang.String r1 = "if (applyWindowInsetsLis…, insetsCompat)\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r1 = r0.isConsumed()
            if (r1 != 0) goto L40
            r1 = 0
            int r2 = r4.getChildCount()
        L34:
            if (r1 >= r2) goto L40
            android.view.View r3 = r4.getChildAt(r1)
            androidx.core.view.ViewCompat.dispatchApplyWindowInsets(r3, r0)
            int r1 = r1 + 1
            goto L34
        L40:
            return r5
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r5) {
            r4 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r4.drawDisappearingViewsFirst
            if (r0 == 0) goto L23
            java.util.List<android.view.View> r0 = r4.disappearingFragmentChildren
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            long r2 = r4.getDrawingTime()
            super.drawChild(r5, r1, r2)
            goto Lf
        L23:
            super.dispatchDraw(r5)
            return
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(android.graphics.Canvas r2, android.view.View r3, long r4) {
            r1 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r1.drawDisappearingViewsFirst
            if (r0 == 0) goto L22
            java.util.List<android.view.View> r0 = r1.disappearingFragmentChildren
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L22
            java.util.List<android.view.View> r0 = r1.disappearingFragmentChildren
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L22
            r2 = 0
            return r2
        L22:
            boolean r2 = super.drawChild(r2, r3, r4)
            return r2
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.List<android.view.View> r0 = r1.transitioningFragmentViews
            r0.remove(r2)
            java.util.List<android.view.View> r0 = r1.disappearingFragmentChildren
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto L15
            r0 = 1
            r1.drawDisappearingViewsFirst = r0
        L15:
            super.endViewTransition(r2)
            return
    }

    public final <F extends androidx.fragment.app.Fragment> F getFragment() {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = androidx.fragment.app.FragmentManager.findFragmentManager(r2)
            int r1 = r2.getId()
            androidx.fragment.app.Fragment r0 = r0.findFragmentById(r1)
            return r0
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r2) {
            r1 = this;
            java.lang.String r0 = "insets"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            return r2
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
            r3 = this;
            int r0 = r3.getChildCount()
            int r0 = r0 + (-1)
        L6:
            r1 = -1
            if (r1 >= r0) goto L18
            android.view.View r1 = r3.getChildAt(r0)
            java.lang.String r2 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r3.addDisappearingFragmentView(r1)
            int r0 = r0 + (-1)
            goto L6
        L18:
            super.removeAllViewsInLayout()
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.addDisappearingFragmentView(r2)
            super.removeView(r2)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int r3) {
            r2 = this;
            android.view.View r0 = r2.getChildAt(r3)
            java.lang.String r1 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.addDisappearingFragmentView(r0)
            super.removeViewAt(r3)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.addDisappearingFragmentView(r2)
            super.removeViewInLayout(r2)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViews(int r5, int r6) {
            r4 = this;
            int r0 = r5 + r6
            r1 = r5
        L3:
            if (r1 >= r0) goto L14
            android.view.View r2 = r4.getChildAt(r1)
            java.lang.String r3 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r4.addDisappearingFragmentView(r2)
            int r1 = r1 + 1
            goto L3
        L14:
            super.removeViews(r5, r6)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int r5, int r6) {
            r4 = this;
            int r0 = r5 + r6
            r1 = r5
        L3:
            if (r1 >= r0) goto L14
            android.view.View r2 = r4.getChildAt(r1)
            java.lang.String r3 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r4.addDisappearingFragmentView(r2)
            int r1 = r1 + 1
            goto L3
        L14:
            super.removeViewsInLayout(r5, r6)
            return
    }

    public final void setDrawDisappearingViewsLast(boolean r1) {
            r0 = this;
            r0.drawDisappearingViewsFirst = r1
            return
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(android.animation.LayoutTransition r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\"."
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(android.view.View.OnApplyWindowInsetsListener r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.applyWindowInsetsListener = r2
            return
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != r1) goto L10
            java.util.List<android.view.View> r0 = r1.transitioningFragmentViews
            r0.add(r2)
        L10:
            super.startViewTransition(r2)
            return
    }
}
