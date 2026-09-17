package androidx.fragment.app;

/* loaded from: classes.dex */
class FragmentAnim {

    static class AnimationOrAnimator {
        public final android.view.animation.Animation animation;
        public final android.animation.Animator animator;

        AnimationOrAnimator(android.animation.Animator r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.animation = r0
                r1.animator = r2
                if (r2 == 0) goto Lb
                return
            Lb:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Animator cannot be null"
                r2.<init>(r0)
                throw r2
        }

        AnimationOrAnimator(android.view.animation.Animation r2) {
                r1 = this;
                r1.<init>()
                r1.animation = r2
                r0 = 0
                r1.animator = r0
                if (r2 == 0) goto Lb
                return
            Lb:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Animation cannot be null"
                r2.<init>(r0)
                throw r2
        }
    }

    static class EndViewTransitionAnimation extends android.view.animation.AnimationSet implements java.lang.Runnable {
        private boolean mAnimating;
        private final android.view.View mChild;
        private boolean mEnded;
        private final android.view.ViewGroup mParent;
        private boolean mTransitionEnded;

        EndViewTransitionAnimation(android.view.animation.Animation r2, android.view.ViewGroup r3, android.view.View r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r0 = 1
                r1.mAnimating = r0
                r1.mParent = r3
                r1.mChild = r4
                r1.addAnimation(r2)
                r3.post(r1)
                return
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long r3, android.view.animation.Transformation r5) {
                r2 = this;
                r0 = 1
                r2.mAnimating = r0
                boolean r1 = r2.mEnded
                if (r1 == 0) goto Lb
                boolean r3 = r2.mTransitionEnded
                r3 = r3 ^ r0
                return r3
            Lb:
                boolean r3 = super.getTransformation(r3, r5)
                if (r3 != 0) goto L18
                r2.mEnded = r0
                android.view.ViewGroup r3 = r2.mParent
                androidx.core.view.OneShotPreDrawListener.add(r3, r2)
            L18:
                return r0
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long r3, android.view.animation.Transformation r5, float r6) {
                r2 = this;
                r0 = 1
                r2.mAnimating = r0
                boolean r1 = r2.mEnded
                if (r1 == 0) goto Lb
                boolean r3 = r2.mTransitionEnded
                r3 = r3 ^ r0
                return r3
            Lb:
                boolean r3 = super.getTransformation(r3, r5, r6)
                if (r3 != 0) goto L18
                r2.mEnded = r0
                android.view.ViewGroup r3 = r2.mParent
                androidx.core.view.OneShotPreDrawListener.add(r3, r2)
            L18:
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                boolean r0 = r2.mEnded
                if (r0 != 0) goto L11
                boolean r0 = r2.mAnimating
                if (r0 == 0) goto L11
                r0 = 0
                r2.mAnimating = r0
                android.view.ViewGroup r0 = r2.mParent
                r0.post(r2)
                goto L1b
            L11:
                android.view.ViewGroup r0 = r2.mParent
                android.view.View r1 = r2.mChild
                r0.endViewTransition(r1)
                r0 = 1
                r2.mTransitionEnded = r0
            L1b:
                return
        }
    }

    private static int getNextAnim(androidx.fragment.app.Fragment r0, boolean r1, boolean r2) {
            if (r2 == 0) goto Le
            if (r1 == 0) goto L9
            int r0 = r0.getPopEnterAnim()
            return r0
        L9:
            int r0 = r0.getPopExitAnim()
            return r0
        Le:
            if (r1 == 0) goto L15
            int r0 = r0.getEnterAnim()
            return r0
        L15:
            int r0 = r0.getExitAnim()
            return r0
    }

    static androidx.fragment.app.FragmentAnim.AnimationOrAnimator loadAnimation(android.content.Context r5, androidx.fragment.app.Fragment r6, boolean r7, boolean r8) {
            int r0 = r6.getNextTransition()
            int r8 = getNextAnim(r6, r7, r8)
            r1 = 0
            r6.setAnimations(r1, r1, r1, r1)
            android.view.ViewGroup r2 = r6.mContainer
            r3 = 0
            if (r2 == 0) goto L1e
            int r4 = androidx.fragment.R$id.visible_removing_fragment_view_tag
            java.lang.Object r2 = r2.getTag(r4)
            if (r2 == 0) goto L1e
            android.view.ViewGroup r2 = r6.mContainer
            r2.setTag(r4, r3)
        L1e:
            android.view.ViewGroup r2 = r6.mContainer
            if (r2 == 0) goto L29
            android.animation.LayoutTransition r2 = r2.getLayoutTransition()
            if (r2 == 0) goto L29
            return r3
        L29:
            android.view.animation.Animation r2 = r6.onCreateAnimation(r0, r7, r8)
            if (r2 == 0) goto L35
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r5 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator
            r5.<init>(r2)
            return r5
        L35:
            android.animation.Animator r6 = r6.onCreateAnimator(r0, r7, r8)
            if (r6 == 0) goto L41
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r5 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator
            r5.<init>(r6)
            return r5
        L41:
            if (r8 != 0) goto L49
            if (r0 == 0) goto L49
            int r8 = transitToAnimResourceId(r5, r0, r7)
        L49:
            if (r8 == 0) goto L8b
            android.content.res.Resources r6 = r5.getResources()
            java.lang.String r6 = r6.getResourceTypeName(r8)
            java.lang.String r7 = "anim"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L6d
            android.view.animation.Animation r7 = android.view.animation.AnimationUtils.loadAnimation(r5, r8)     // Catch: java.lang.RuntimeException -> L69 android.content.res.Resources.NotFoundException -> L6b
            if (r7 == 0) goto L67
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator     // Catch: java.lang.RuntimeException -> L69 android.content.res.Resources.NotFoundException -> L6b
            r0.<init>(r7)     // Catch: java.lang.RuntimeException -> L69 android.content.res.Resources.NotFoundException -> L6b
            return r0
        L67:
            r1 = 1
            goto L6d
        L69:
            goto L6d
        L6b:
            r5 = move-exception
            throw r5
        L6d:
            if (r1 != 0) goto L8b
            android.animation.Animator r7 = android.animation.AnimatorInflater.loadAnimator(r5, r8)     // Catch: java.lang.RuntimeException -> L7b
            if (r7 == 0) goto L8b
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator     // Catch: java.lang.RuntimeException -> L7b
            r0.<init>(r7)     // Catch: java.lang.RuntimeException -> L7b
            return r0
        L7b:
            r7 = move-exception
            if (r6 != 0) goto L8a
            android.view.animation.Animation r5 = android.view.animation.AnimationUtils.loadAnimation(r5, r8)
            if (r5 == 0) goto L8b
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r6 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator
            r6.<init>(r5)
            return r6
        L8a:
            throw r7
        L8b:
            return r3
    }

    private static int toActivityTransitResId(android.content.Context r2, int r3) {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 16973825(0x1030001, float:2.4060903E-38)
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            r3 = -1
            int r3 = r2.getResourceId(r1, r3)
            r2.recycle()
            return r3
    }

    private static int transitToAnimResourceId(android.content.Context r1, int r2, boolean r3) {
            r0 = 4097(0x1001, float:5.741E-42)
            if (r2 == r0) goto L4a
            r0 = 8194(0x2002, float:1.1482E-41)
            if (r2 == r0) goto L42
            r0 = 8197(0x2005, float:1.1486E-41)
            if (r2 == r0) goto L30
            r0 = 4099(0x1003, float:5.744E-42)
            if (r2 == r0) goto L28
            r0 = 4100(0x1004, float:5.745E-42)
            if (r2 == r0) goto L16
            r1 = -1
            goto L51
        L16:
            if (r3 == 0) goto L20
            r2 = 16842936(0x10100b8, float:2.3694074E-38)
            int r1 = toActivityTransitResId(r1, r2)
            goto L51
        L20:
            r2 = 16842937(0x10100b9, float:2.3694076E-38)
            int r1 = toActivityTransitResId(r1, r2)
            goto L51
        L28:
            if (r3 == 0) goto L2d
            int r1 = androidx.fragment.R$animator.fragment_fade_enter
            goto L51
        L2d:
            int r1 = androidx.fragment.R$animator.fragment_fade_exit
            goto L51
        L30:
            if (r3 == 0) goto L3a
            r2 = 16842938(0x10100ba, float:2.369408E-38)
            int r1 = toActivityTransitResId(r1, r2)
            goto L51
        L3a:
            r2 = 16842939(0x10100bb, float:2.3694082E-38)
            int r1 = toActivityTransitResId(r1, r2)
            goto L51
        L42:
            if (r3 == 0) goto L47
            int r1 = androidx.fragment.R$animator.fragment_close_enter
            goto L51
        L47:
            int r1 = androidx.fragment.R$animator.fragment_close_exit
            goto L51
        L4a:
            if (r3 == 0) goto L4f
            int r1 = androidx.fragment.R$animator.fragment_open_enter
            goto L51
        L4f:
            int r1 = androidx.fragment.R$animator.fragment_open_exit
        L51:
            return r1
    }
}
