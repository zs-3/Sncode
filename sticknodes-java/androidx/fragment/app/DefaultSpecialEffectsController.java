package androidx.fragment.app;

/* loaded from: classes.dex */
class DefaultSpecialEffectsController extends androidx.fragment.app.SpecialEffectsController {


    /* renamed from: androidx.fragment.app.DefaultSpecialEffectsController$10, reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {
        static final /* synthetic */ int[] $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State = null;

        static {
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.fragment.app.DefaultSpecialEffectsController.AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State = r0
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.fragment.app.DefaultSpecialEffectsController.AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.fragment.app.DefaultSpecialEffectsController.AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.fragment.app.DefaultSpecialEffectsController.AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }









    private static class AnimationInfo extends androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo {
        private androidx.fragment.app.FragmentAnim.AnimationOrAnimator mAnimation;
        private boolean mIsPop;
        private boolean mLoadedAnim;

        AnimationInfo(androidx.fragment.app.SpecialEffectsController.Operation r1, androidx.core.os.CancellationSignal r2, boolean r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.mLoadedAnim = r1
                r0.mIsPop = r3
                return
        }

        androidx.fragment.app.FragmentAnim.AnimationOrAnimator getAnimation(android.content.Context r5) {
                r4 = this;
                boolean r0 = r4.mLoadedAnim
                if (r0 == 0) goto L7
                androidx.fragment.app.FragmentAnim$AnimationOrAnimator r5 = r4.mAnimation
                return r5
            L7:
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r4.getOperation()
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r4.getOperation()
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r1.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                r3 = 1
                if (r1 != r2) goto L1e
                r1 = 1
                goto L1f
            L1e:
                r1 = 0
            L1f:
                boolean r2 = r4.mIsPop
                androidx.fragment.app.FragmentAnim$AnimationOrAnimator r5 = androidx.fragment.app.FragmentAnim.loadAnimation(r5, r0, r1, r2)
                r4.mAnimation = r5
                r4.mLoadedAnim = r3
                return r5
        }
    }

    private static class SpecialEffectsInfo {
        private final androidx.fragment.app.SpecialEffectsController.Operation mOperation;
        private final androidx.core.os.CancellationSignal mSignal;

        SpecialEffectsInfo(androidx.fragment.app.SpecialEffectsController.Operation r1, androidx.core.os.CancellationSignal r2) {
                r0 = this;
                r0.<init>()
                r0.mOperation = r1
                r0.mSignal = r2
                return
        }

        void completeSpecialEffect() {
                r2 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r2.mOperation
                androidx.core.os.CancellationSignal r1 = r2.mSignal
                r0.completeSpecialEffect(r1)
                return
        }

        androidx.fragment.app.SpecialEffectsController.Operation getOperation() {
                r1 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r1.mOperation
                return r0
        }

        androidx.core.os.CancellationSignal getSignal() {
                r1 = this;
                androidx.core.os.CancellationSignal r0 = r1.mSignal
                return r0
        }

        boolean isVisibilityUnchanged() {
                r3 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r3.mOperation
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                android.view.View r0 = r0.mView
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r0)
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r3.mOperation
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r1.getFinalState()
                if (r0 == r1) goto L1d
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r0 == r2) goto L1b
                if (r1 == r2) goto L1b
                goto L1d
            L1b:
                r0 = 0
                goto L1e
            L1d:
                r0 = 1
            L1e:
                return r0
        }
    }

    private static class TransitionInfo extends androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo {
        private final boolean mOverlapAllowed;
        private final java.lang.Object mSharedElementTransition;
        private final java.lang.Object mTransition;

        TransitionInfo(androidx.fragment.app.SpecialEffectsController.Operation r2, androidx.core.os.CancellationSignal r3, boolean r4, boolean r5) {
                r1 = this;
                r1.<init>(r2, r3)
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = r2.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r3 != r0) goto L36
                if (r4 == 0) goto L16
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                java.lang.Object r3 = r3.getReenterTransition()
                goto L1e
            L16:
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                java.lang.Object r3 = r3.getEnterTransition()
            L1e:
                r1.mTransition = r3
                if (r4 == 0) goto L2b
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                boolean r3 = r3.getAllowReturnTransitionOverlap()
                goto L33
            L2b:
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                boolean r3 = r3.getAllowEnterTransitionOverlap()
            L33:
                r1.mOverlapAllowed = r3
                goto L4e
            L36:
                if (r4 == 0) goto L41
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                java.lang.Object r3 = r3.getReturnTransition()
                goto L49
            L41:
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                java.lang.Object r3 = r3.getExitTransition()
            L49:
                r1.mTransition = r3
                r3 = 1
                r1.mOverlapAllowed = r3
            L4e:
                if (r5 == 0) goto L68
                if (r4 == 0) goto L5d
                androidx.fragment.app.Fragment r2 = r2.getFragment()
                java.lang.Object r2 = r2.getSharedElementReturnTransition()
                r1.mSharedElementTransition = r2
                goto L6b
            L5d:
                androidx.fragment.app.Fragment r2 = r2.getFragment()
                java.lang.Object r2 = r2.getSharedElementEnterTransition()
                r1.mSharedElementTransition = r2
                goto L6b
            L68:
                r2 = 0
                r1.mSharedElementTransition = r2
            L6b:
                return
        }

        private androidx.fragment.app.FragmentTransitionImpl getHandlingImpl(java.lang.Object r4) {
                r3 = this;
                if (r4 != 0) goto L4
                r4 = 0
                return r4
            L4:
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
                if (r0 == 0) goto Lf
                boolean r1 = r0.canHandle(r4)
                if (r1 == 0) goto Lf
                return r0
            Lf:
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
                if (r0 == 0) goto L1a
                boolean r1 = r0.canHandle(r4)
                if (r1 == 0) goto L1a
                return r0
            L1a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Transition "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " for fragment "
                r1.append(r4)
                androidx.fragment.app.SpecialEffectsController$Operation r4 = r3.getOperation()
                androidx.fragment.app.Fragment r4 = r4.getFragment()
                r1.append(r4)
                java.lang.String r4 = " is not a valid framework Transition or AndroidX Transition"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        androidx.fragment.app.FragmentTransitionImpl getHandlingImpl() {
                r3 = this;
                java.lang.Object r0 = r3.mTransition
                androidx.fragment.app.FragmentTransitionImpl r0 = r3.getHandlingImpl(r0)
                java.lang.Object r1 = r3.mSharedElementTransition
                androidx.fragment.app.FragmentTransitionImpl r1 = r3.getHandlingImpl(r1)
                if (r0 == 0) goto L46
                if (r1 == 0) goto L46
                if (r0 != r1) goto L13
                goto L46
            L13:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
                r1.append(r2)
                androidx.fragment.app.SpecialEffectsController$Operation r2 = r3.getOperation()
                androidx.fragment.app.Fragment r2 = r2.getFragment()
                r1.append(r2)
                java.lang.String r2 = " returned Transition "
                r1.append(r2)
                java.lang.Object r2 = r3.mTransition
                r1.append(r2)
                java.lang.String r2 = " which uses a different Transition  type than its shared element transition "
                r1.append(r2)
                java.lang.Object r2 = r3.mSharedElementTransition
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L46:
                if (r0 == 0) goto L49
                goto L4a
            L49:
                r0 = r1
            L4a:
                return r0
        }

        public java.lang.Object getSharedElementTransition() {
                r1 = this;
                java.lang.Object r0 = r1.mSharedElementTransition
                return r0
        }

        java.lang.Object getTransition() {
                r1 = this;
                java.lang.Object r0 = r1.mTransition
                return r0
        }

        public boolean hasSharedElementTransition() {
                r1 = this;
                java.lang.Object r0 = r1.mSharedElementTransition
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        boolean isOverlapAllowed() {
                r1 = this;
                boolean r0 = r1.mOverlapAllowed
                return r0
        }
    }

    DefaultSpecialEffectsController(android.view.ViewGroup r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void startAnimations(java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo> r21, java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r22, boolean r23, java.util.Map<androidx.fragment.app.SpecialEffectsController.Operation, java.lang.Boolean> r24) {
            r20 = this;
            android.view.ViewGroup r7 = r20.getContainer()
            android.content.Context r8 = r7.getContext()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r21.iterator()
            r6 = 0
        L12:
            boolean r0 = r10.hasNext()
            java.lang.String r13 = " has started."
            java.lang.String r14 = "FragmentManager"
            r15 = 2
            if (r0 == 0) goto Le8
            java.lang.Object r0 = r10.next()
            r5 = r0
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r5 = (androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo) r5
            boolean r0 = r5.isVisibilityUnchanged()
            if (r0 == 0) goto L30
            r5.completeSpecialEffect()
        L2d:
            r2 = r24
            goto L12
        L30:
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = r5.getAnimation(r8)
            if (r0 != 0) goto L3a
            r5.completeSpecialEffect()
            goto L2d
        L3a:
            android.animation.Animator r4 = r0.animator
            if (r4 != 0) goto L42
            r9.add(r5)
            goto L2d
        L42:
            androidx.fragment.app.SpecialEffectsController$Operation r3 = r5.getOperation()
            androidx.fragment.app.Fragment r0 = r3.getFragment()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r2 = r24
            java.lang.Object r11 = r2.get(r3)
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L7b
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r15)
            if (r1 == 0) goto L77
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Ignoring Animator set on "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = " as this Fragment was involved in a Transition."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r14, r0)
        L77:
            r5.completeSpecialEffect()
            goto L12
        L7b:
            androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r3.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r6 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            if (r1 != r6) goto L85
            r6 = 1
            goto L86
        L85:
            r6 = 0
        L86:
            r11 = r22
            if (r6 == 0) goto L8d
            r11.remove(r3)
        L8d:
            android.view.View r1 = r0.mView
            r7.startViewTransition(r1)
            androidx.fragment.app.DefaultSpecialEffectsController$2 r0 = new androidx.fragment.app.DefaultSpecialEffectsController$2
            r16 = r0
            r17 = r1
            r1 = r20
            r2 = r7
            r18 = r3
            r3 = r17
            r12 = r4
            r4 = r6
            r19 = r5
            r5 = r18
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.addListener(r0)
            r0 = r17
            r12.setTarget(r0)
            r12.start()
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r15)
            if (r0 == 0) goto Ld5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Animator from operation "
            r0.append(r1)
            r1 = r18
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r14, r0)
            goto Ld7
        Ld5:
            r1 = r18
        Ld7:
            androidx.core.os.CancellationSignal r0 = r19.getSignal()
            androidx.fragment.app.DefaultSpecialEffectsController$3 r2 = new androidx.fragment.app.DefaultSpecialEffectsController$3
            r5 = r20
            r2.<init>(r5, r12, r1)
            r0.setOnCancelListener(r2)
            r6 = 1
            goto L12
        Le8:
            r5 = r20
            java.util.Iterator r9 = r9.iterator()
        Lee:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L1c8
            java.lang.Object r0 = r9.next()
            r10 = r0
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r10 = (androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo) r10
            androidx.fragment.app.SpecialEffectsController$Operation r11 = r10.getOperation()
            androidx.fragment.app.Fragment r0 = r11.getFragment()
            java.lang.String r1 = "Ignoring Animation set on "
            if (r23 == 0) goto L128
            boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r15)
            if (r2 == 0) goto L124
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = " as Animations cannot run alongside Transitions."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.v(r14, r0)
        L124:
            r10.completeSpecialEffect()
            goto Lee
        L128:
            if (r6 == 0) goto L14b
            boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r15)
            if (r2 == 0) goto L147
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = " as Animations cannot run alongside Animators."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.v(r14, r0)
        L147:
            r10.completeSpecialEffect()
            goto Lee
        L14b:
            android.view.View r12 = r0.mView
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = r10.getAnimation(r8)
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = (androidx.fragment.app.FragmentAnim.AnimationOrAnimator) r0
            android.view.animation.Animation r0 = r0.animation
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            android.view.animation.Animation r0 = (android.view.animation.Animation) r0
            androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r11.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
            if (r1 == r2) goto L171
            r12.startAnimation(r0)
            r10.completeSpecialEffect()
            r16 = r6
            r6 = 2
            goto L1ad
        L171:
            r7.startViewTransition(r12)
            androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation r4 = new androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation
            r4.<init>(r0, r7, r12)
            androidx.fragment.app.DefaultSpecialEffectsController$4 r3 = new androidx.fragment.app.DefaultSpecialEffectsController$4
            r0 = r3
            r1 = r20
            r2 = r11
            r15 = r3
            r3 = r7
            r16 = r6
            r6 = r4
            r4 = r12
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r6.setAnimationListener(r15)
            r12.startAnimation(r6)
            r6 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r6)
            if (r0 == 0) goto L1ad
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Animation from operation "
            r0.append(r1)
            r0.append(r11)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r14, r0)
        L1ad:
            androidx.core.os.CancellationSignal r15 = r10.getSignal()
            androidx.fragment.app.DefaultSpecialEffectsController$5 r5 = new androidx.fragment.app.DefaultSpecialEffectsController$5
            r0 = r5
            r1 = r20
            r2 = r12
            r3 = r7
            r4 = r10
            r10 = r5
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r15.setOnCancelListener(r10)
            r15 = 2
            r5 = r20
            r6 = r16
            goto Lee
        L1c8:
            return
    }

    private java.util.Map<androidx.fragment.app.SpecialEffectsController.Operation, java.lang.Boolean> startTransitions(java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> r34, java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r35, boolean r36, androidx.fragment.app.SpecialEffectsController.Operation r37, androidx.fragment.app.SpecialEffectsController.Operation r38) {
            r33 = this;
            r6 = r33
            r7 = r36
            r8 = r37
            r9 = r38
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.Iterator r0 = r34.iterator()
            r15 = 0
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L62
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r1 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r1
            boolean r2 = r1.isVisibilityUnchanged()
            if (r2 == 0) goto L25
            goto L12
        L25:
            androidx.fragment.app.FragmentTransitionImpl r2 = r1.getHandlingImpl()
            if (r15 != 0) goto L2d
            r15 = r2
            goto L12
        L2d:
            if (r2 == 0) goto L12
            if (r15 != r2) goto L32
            goto L12
        L32:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            r2.append(r3)
            androidx.fragment.app.SpecialEffectsController$Operation r3 = r1.getOperation()
            androidx.fragment.app.Fragment r3 = r3.getFragment()
            r2.append(r3)
            java.lang.String r3 = " returned Transition "
            r2.append(r3)
            java.lang.Object r1 = r1.getTransition()
            r2.append(r1)
            java.lang.String r1 = " which uses a different Transition  type than other Fragments."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L62:
            if (r15 != 0) goto L82
            java.util.Iterator r0 = r34.iterator()
        L68:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L81
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r1 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r1
            androidx.fragment.app.SpecialEffectsController$Operation r2 = r1.getOperation()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r10.put(r2, r3)
            r1.completeSpecialEffect()
            goto L68
        L81:
            return r10
        L82:
            android.view.View r14 = new android.view.View
            android.view.ViewGroup r0 = r33.getContainer()
            android.content.Context r0 = r0.getContext()
            r14.<init>(r0)
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            androidx.collection.ArrayMap r4 = new androidx.collection.ArrayMap
            r4.<init>()
            java.util.Iterator r20 = r34.iterator()
            r0 = 0
            r2 = 0
            r21 = 0
        Lab:
            boolean r1 = r20.hasNext()
            r22 = 2
            java.lang.String r3 = "FragmentManager"
            if (r1 == 0) goto L2e9
            java.lang.Object r1 = r20.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r1 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r1
            boolean r17 = r1.hasSharedElementTransition()
            if (r17 == 0) goto L2c6
            if (r8 == 0) goto L2c6
            if (r9 == 0) goto L2c6
            java.lang.Object r0 = r1.getSharedElementTransition()
            java.lang.Object r0 = r15.cloneTransition(r0)
            java.lang.Object r1 = r15.wrapTransitionInSet(r0)
            androidx.fragment.app.Fragment r0 = r38.getFragment()
            java.util.ArrayList r0 = r0.getSharedElementSourceNames()
            androidx.fragment.app.Fragment r17 = r37.getFragment()
            java.util.ArrayList r11 = r17.getSharedElementSourceNames()
            androidx.fragment.app.Fragment r17 = r37.getFragment()
            r18 = r1
            java.util.ArrayList r1 = r17.getSharedElementTargetNames()
            r17 = r2
            r2 = 0
        Lee:
            int r9 = r1.size()
            if (r2 >= r9) goto L10f
            java.lang.Object r9 = r1.get(r2)
            int r9 = r0.indexOf(r9)
            r19 = r1
            r1 = -1
            if (r9 == r1) goto L10a
            java.lang.Object r1 = r11.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.set(r9, r1)
        L10a:
            int r2 = r2 + 1
            r1 = r19
            goto Lee
        L10f:
            androidx.fragment.app.Fragment r1 = r38.getFragment()
            java.util.ArrayList r9 = r1.getSharedElementTargetNames()
            if (r7 != 0) goto L128
            androidx.fragment.app.Fragment r1 = r37.getFragment()
            r1.getExitTransitionCallback()
            androidx.fragment.app.Fragment r1 = r38.getFragment()
            r1.getEnterTransitionCallback()
            goto L136
        L128:
            androidx.fragment.app.Fragment r1 = r37.getFragment()
            r1.getEnterTransitionCallback()
            androidx.fragment.app.Fragment r1 = r38.getFragment()
            r1.getExitTransitionCallback()
        L136:
            int r1 = r0.size()
            r2 = 0
        L13b:
            if (r2 >= r1) goto L155
            java.lang.Object r11 = r0.get(r2)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r19 = r9.get(r2)
            r24 = r1
            r1 = r19
            java.lang.String r1 = (java.lang.String) r1
            r4.put(r11, r1)
            int r2 = r2 + 1
            r1 = r24
            goto L13b
        L155:
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r22)
            if (r1 == 0) goto L1b5
            java.lang.String r1 = ">>> entering view names <<<"
            android.util.Log.v(r3, r1)
            java.util.Iterator r1 = r9.iterator()
        L164:
            boolean r2 = r1.hasNext()
            java.lang.String r11 = "Name: "
            if (r2 == 0) goto L189
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r19 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r3, r1)
            r1 = r19
            goto L164
        L189:
            java.lang.String r1 = ">>> exiting view names <<<"
            android.util.Log.v(r3, r1)
            java.util.Iterator r1 = r0.iterator()
        L192:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1b5
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r19 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r3, r1)
            r1 = r19
            goto L192
        L1b5:
            androidx.collection.ArrayMap r11 = new androidx.collection.ArrayMap
            r11.<init>()
            androidx.fragment.app.Fragment r1 = r37.getFragment()
            android.view.View r1 = r1.mView
            r6.findNamedViews(r11, r1)
            r11.retainAll(r0)
            java.util.Set r1 = r11.keySet()
            r4.retainAll(r1)
            androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
            r3.<init>()
            androidx.fragment.app.Fragment r1 = r38.getFragment()
            android.view.View r1 = r1.mView
            r6.findNamedViews(r3, r1)
            r3.retainAll(r9)
            java.util.Collection r1 = r4.values()
            r3.retainAll(r1)
            androidx.fragment.app.FragmentTransition.retainValues(r4, r3)
            java.util.Set r1 = r4.keySet()
            r6.retainMatchingViews(r11, r1)
            java.util.Collection r1 = r4.values()
            r6.retainMatchingViews(r3, r1)
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L213
            r12.clear()
            r5.clear()
            r26 = r4
            r1 = r5
            r4 = r8
            r5 = r12
            r7 = r13
            r9 = r14
            r11 = r15
            r2 = r17
            r0 = 0
            r14 = r38
            r15 = r10
            r10 = 0
            goto L2d8
        L213:
            androidx.fragment.app.Fragment r1 = r38.getFragment()
            androidx.fragment.app.Fragment r2 = r37.getFragment()
            r8 = 1
            androidx.fragment.app.FragmentTransition.callSharedElementStartEnd(r1, r2, r7, r11, r8)
            android.view.ViewGroup r2 = r33.getContainer()
            androidx.fragment.app.DefaultSpecialEffectsController$6 r1 = new androidx.fragment.app.DefaultSpecialEffectsController$6
            r19 = r0
            r0 = r1
            r7 = r1
            r8 = r18
            r1 = r33
            r24 = r10
            r25 = r17
            r10 = r2
            r2 = r38
            r16 = r3
            r17 = r14
            r14 = 0
            r3 = r37
            r26 = r4
            r4 = r36
            r27 = r5
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.core.view.OneShotPreDrawListener.add(r10, r7)
            java.util.Collection r0 = r11.values()
            r12.addAll(r0)
            boolean r0 = r19.isEmpty()
            if (r0 != 0) goto L269
            r0 = r19
            java.lang.Object r0 = r0.get(r14)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r11.get(r0)
            android.view.View r0 = (android.view.View) r0
            r15.setEpicenter(r8, r0)
            r2 = r0
            goto L26b
        L269:
            r2 = r25
        L26b:
            java.util.Collection r0 = r16.values()
            r1 = r27
            r1.addAll(r0)
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L29b
            java.lang.Object r0 = r9.get(r14)
            java.lang.String r0 = (java.lang.String) r0
            r3 = r16
            java.lang.Object r0 = r3.get(r0)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L29b
            android.view.ViewGroup r3 = r33.getContainer()
            androidx.fragment.app.DefaultSpecialEffectsController$7 r4 = new androidx.fragment.app.DefaultSpecialEffectsController$7
            r4.<init>(r6, r15, r0, r13)
            androidx.core.view.OneShotPreDrawListener.add(r3, r4)
            r0 = r17
            r21 = 1
            goto L29d
        L29b:
            r0 = r17
        L29d:
            r15.setSharedElementTargets(r8, r0, r12)
            r3 = 0
            r4 = 0
            r16 = 0
            r17 = 0
            r5 = r12
            r12 = r15
            r7 = r13
            r13 = r8
            r9 = r0
            r10 = 0
            r14 = r3
            r11 = r15
            r15 = r4
            r18 = r8
            r19 = r1
            r12.scheduleRemoveTargets(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4 = r37
            r15 = r24
            r15.put(r4, r0)
            r14 = r38
            r15.put(r14, r0)
            r0 = r8
            goto L2d8
        L2c6:
            r25 = r2
            r26 = r4
            r1 = r5
            r4 = r8
            r5 = r12
            r7 = r13
            r11 = r15
            r15 = r10
            r10 = 0
            r32 = r14
            r14 = r9
            r9 = r32
            r2 = r25
        L2d8:
            r8 = r4
            r12 = r5
            r13 = r7
            r10 = r15
            r4 = r26
            r7 = r36
            r5 = r1
            r15 = r11
            r32 = r14
            r14 = r9
            r9 = r32
            goto Lab
        L2e9:
            r25 = r2
            r26 = r4
            r1 = r5
            r4 = r8
            r5 = r12
            r7 = r13
            r11 = r15
            r2 = 1
            r15 = r10
            r10 = 0
            r32 = r14
            r14 = r9
            r9 = r32
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r20 = r34.iterator()
            r12 = 0
            r13 = 0
        L305:
            boolean r16 = r20.hasNext()
            if (r16 == 0) goto L420
            java.lang.Object r16 = r20.next()
            r23 = r16
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r23 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r23
            boolean r16 = r23.isVisibilityUnchanged()
            if (r16 == 0) goto L328
            androidx.fragment.app.SpecialEffectsController$Operation r2 = r23.getOperation()
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r15.put(r2, r10)
            r23.completeSpecialEffect()
        L325:
            r2 = 1
            r10 = 0
            goto L305
        L328:
            java.lang.Object r2 = r23.getTransition()
            java.lang.Object r2 = r11.cloneTransition(r2)
            androidx.fragment.app.SpecialEffectsController$Operation r10 = r23.getOperation()
            if (r0 == 0) goto L33d
            if (r10 == r4) goto L33a
            if (r10 != r14) goto L33d
        L33a:
            r16 = 1
            goto L33f
        L33d:
            r16 = 0
        L33f:
            if (r2 != 0) goto L35c
            if (r16 != 0) goto L34b
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r15.put(r10, r2)
            r23.completeSpecialEffect()
        L34b:
            r31 = r1
            r28 = r3
            r30 = r5
            r29 = r9
            r2 = r12
            r1 = r15
            r3 = r25
            r10 = 0
            r12 = r35
            goto L410
        L35c:
            r28 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r36 = r12
            androidx.fragment.app.Fragment r12 = r10.getFragment()
            android.view.View r12 = r12.mView
            r6.captureTransitioningViews(r3, r12)
            if (r16 == 0) goto L379
            if (r10 != r4) goto L376
            r3.removeAll(r5)
            goto L379
        L376:
            r3.removeAll(r1)
        L379:
            boolean r12 = r3.isEmpty()
            if (r12 == 0) goto L38f
            r11.addTarget(r2, r9)
            r12 = r35
            r31 = r1
            r30 = r5
            r29 = r9
            r5 = r13
            r1 = r15
            r9 = r36
            goto L3df
        L38f:
            r11.addTargets(r2, r3)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r29 = r9
            r9 = r36
            r12 = r11
            r30 = r5
            r5 = r13
            r13 = r2
            r31 = r1
            r1 = r14
            r14 = r2
            r1 = r15
            r15 = r3
            r12.scheduleRemoveTargets(r13, r14, r15, r16, r17, r18, r19)
            androidx.fragment.app.SpecialEffectsController$Operation$State r12 = r10.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r13 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            if (r12 != r13) goto L3dd
            r12 = r35
            r12.remove(r10)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r3)
            androidx.fragment.app.Fragment r14 = r10.getFragment()
            android.view.View r14 = r14.mView
            r13.remove(r14)
            androidx.fragment.app.Fragment r14 = r10.getFragment()
            android.view.View r14 = r14.mView
            r11.scheduleHideFragmentView(r2, r14, r13)
            android.view.ViewGroup r13 = r33.getContainer()
            androidx.fragment.app.DefaultSpecialEffectsController$8 r14 = new androidx.fragment.app.DefaultSpecialEffectsController$8
            r14.<init>(r6, r3)
            androidx.core.view.OneShotPreDrawListener.add(r13, r14)
            goto L3df
        L3dd:
            r12 = r35
        L3df:
            androidx.fragment.app.SpecialEffectsController$Operation$State r13 = r10.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r14 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r13 != r14) goto L3f2
            r8.addAll(r3)
            if (r21 == 0) goto L3ef
            r11.setEpicenter(r2, r7)
        L3ef:
            r3 = r25
            goto L3f7
        L3f2:
            r3 = r25
            r11.setEpicenter(r2, r3)
        L3f7:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r1.put(r10, r13)
            boolean r10 = r23.isOverlapAllowed()
            if (r10 == 0) goto L40a
            r10 = 0
            java.lang.Object r2 = r11.mergeTransitionsTogether(r5, r2, r10)
            r13 = r2
            r2 = r9
            goto L410
        L40a:
            r10 = 0
            java.lang.Object r2 = r11.mergeTransitionsTogether(r9, r2, r10)
            r13 = r5
        L410:
            r14 = r38
            r15 = r1
            r12 = r2
            r25 = r3
            r3 = r28
            r9 = r29
            r5 = r30
            r1 = r31
            goto L325
        L420:
            r31 = r1
            r28 = r3
            r30 = r5
            r9 = r12
            r5 = r13
            r1 = r15
            java.lang.Object r2 = r11.mergeTransitionsInSequence(r5, r9, r0)
            if (r2 != 0) goto L430
            return r1
        L430:
            java.util.Iterator r3 = r34.iterator()
        L434:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L4b7
            java.lang.Object r5 = r3.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r5 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r5
            boolean r7 = r5.isVisibilityUnchanged()
            if (r7 == 0) goto L447
            goto L434
        L447:
            java.lang.Object r7 = r5.getTransition()
            androidx.fragment.app.SpecialEffectsController$Operation r9 = r5.getOperation()
            r10 = r1
            r1 = r38
            if (r0 == 0) goto L45a
            if (r9 == r4) goto L458
            if (r9 != r1) goto L45a
        L458:
            r12 = 1
            goto L45b
        L45a:
            r12 = 0
        L45b:
            if (r7 != 0) goto L463
            if (r12 == 0) goto L460
            goto L463
        L460:
            r12 = r28
            goto L4b2
        L463:
            android.view.ViewGroup r7 = r33.getContainer()
            boolean r7 = androidx.core.view.ViewCompat.isLaidOut(r7)
            if (r7 != 0) goto L49c
            boolean r7 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r22)
            if (r7 == 0) goto L496
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r12 = "SpecialEffectsController: Container "
            r7.append(r12)
            android.view.ViewGroup r12 = r33.getContainer()
            r7.append(r12)
            java.lang.String r12 = " has not been laid out. Completing operation "
            r7.append(r12)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            r12 = r28
            android.util.Log.v(r12, r7)
            goto L498
        L496:
            r12 = r28
        L498:
            r5.completeSpecialEffect()
            goto L4b2
        L49c:
            r12 = r28
            androidx.fragment.app.SpecialEffectsController$Operation r7 = r5.getOperation()
            androidx.fragment.app.Fragment r7 = r7.getFragment()
            androidx.core.os.CancellationSignal r13 = r5.getSignal()
            androidx.fragment.app.DefaultSpecialEffectsController$9 r14 = new androidx.fragment.app.DefaultSpecialEffectsController$9
            r14.<init>(r6, r5, r9)
            r11.setListenerForTransitionEnd(r7, r2, r13, r14)
        L4b2:
            r1 = r10
            r28 = r12
            goto L434
        L4b7:
            r10 = r1
            r12 = r28
            android.view.ViewGroup r1 = r33.getContainer()
            boolean r1 = androidx.core.view.ViewCompat.isLaidOut(r1)
            if (r1 != 0) goto L4c5
            return r10
        L4c5:
            r1 = 4
            androidx.fragment.app.FragmentTransition.setViewVisibility(r8, r1)
            r1 = r31
            java.util.ArrayList r16 = r11.prepareSetNameOverridesReordered(r1)
            boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r22)
            if (r3 == 0) goto L542
            java.lang.String r3 = ">>>>> Beginning transition <<<<<"
            android.util.Log.v(r12, r3)
            java.lang.String r3 = ">>>>> SharedElementFirstOutViews <<<<<"
            android.util.Log.v(r12, r3)
            java.util.Iterator r3 = r30.iterator()
        L4e3:
            boolean r4 = r3.hasNext()
            java.lang.String r5 = " Name: "
            java.lang.String r7 = "View: "
            if (r4 == 0) goto L510
            java.lang.Object r4 = r3.next()
            android.view.View r4 = (android.view.View) r4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r4)
            r9.append(r5)
            java.lang.String r4 = androidx.core.view.ViewCompat.getTransitionName(r4)
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            android.util.Log.v(r12, r4)
            goto L4e3
        L510:
            java.lang.String r3 = ">>>>> SharedElementLastInViews <<<<<"
            android.util.Log.v(r12, r3)
            java.util.Iterator r3 = r1.iterator()
        L519:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L542
            java.lang.Object r4 = r3.next()
            android.view.View r4 = (android.view.View) r4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r4)
            r9.append(r5)
            java.lang.String r4 = androidx.core.view.ViewCompat.getTransitionName(r4)
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            android.util.Log.v(r12, r4)
            goto L519
        L542:
            android.view.ViewGroup r3 = r33.getContainer()
            r11.beginDelayedTransition(r3, r2)
            android.view.ViewGroup r13 = r33.getContainer()
            r12 = r11
            r14 = r30
            r15 = r1
            r17 = r26
            r12.setNameOverridesReordered(r13, r14, r15, r16, r17)
            r2 = 0
            androidx.fragment.app.FragmentTransition.setViewVisibility(r8, r2)
            r2 = r30
            r11.swapSharedElementTargets(r0, r2, r1)
            return r10
    }

    private void syncAnimations(java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r5) {
            r4 = this;
            int r0 = r5.size()
            int r0 = r0 + (-1)
            java.lang.Object r0 = r5.get(r0)
            androidx.fragment.app.SpecialEffectsController$Operation r0 = (androidx.fragment.app.SpecialEffectsController.Operation) r0
            androidx.fragment.app.Fragment r0 = r0.getFragment()
            java.util.Iterator r5 = r5.iterator()
        L14:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L51
            java.lang.Object r1 = r5.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            androidx.fragment.app.Fragment$AnimationInfo r2 = r2.mAnimationInfo
            androidx.fragment.app.Fragment$AnimationInfo r3 = r0.mAnimationInfo
            int r3 = r3.mEnterAnim
            r2.mEnterAnim = r3
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            androidx.fragment.app.Fragment$AnimationInfo r2 = r2.mAnimationInfo
            androidx.fragment.app.Fragment$AnimationInfo r3 = r0.mAnimationInfo
            int r3 = r3.mExitAnim
            r2.mExitAnim = r3
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            androidx.fragment.app.Fragment$AnimationInfo r2 = r2.mAnimationInfo
            androidx.fragment.app.Fragment$AnimationInfo r3 = r0.mAnimationInfo
            int r3 = r3.mPopEnterAnim
            r2.mPopEnterAnim = r3
            androidx.fragment.app.Fragment r1 = r1.getFragment()
            androidx.fragment.app.Fragment$AnimationInfo r1 = r1.mAnimationInfo
            androidx.fragment.app.Fragment$AnimationInfo r2 = r0.mAnimationInfo
            int r2 = r2.mPopExitAnim
            r1.mPopExitAnim = r2
            goto L14
        L51:
            return
    }

    void applyContainerChanges(androidx.fragment.app.SpecialEffectsController.Operation r2) {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r2.getFragment()
            android.view.View r0 = r0.mView
            androidx.fragment.app.SpecialEffectsController$Operation$State r2 = r2.getFinalState()
            r2.applyState(r0)
            return
    }

    void captureTransitioningViews(java.util.ArrayList<android.view.View> r5, android.view.View r6) {
            r4 = this;
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2e
            r0 = r6
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            boolean r1 = androidx.core.view.ViewGroupCompat.isTransitionGroup(r0)
            if (r1 == 0) goto L17
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L37
            r5.add(r0)
            goto L37
        L17:
            int r6 = r0.getChildCount()
            r1 = 0
        L1c:
            if (r1 >= r6) goto L37
            android.view.View r2 = r0.getChildAt(r1)
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L2b
            r4.captureTransitioningViews(r5, r2)
        L2b:
            int r1 = r1 + 1
            goto L1c
        L2e:
            boolean r0 = r5.contains(r6)
            if (r0 != 0) goto L37
            r5.add(r6)
        L37:
            return
    }

    @Override // androidx.fragment.app.SpecialEffectsController
    void executeOperations(java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r14, boolean r15) {
            r13 = this;
            java.util.Iterator r0 = r14.iterator()
            r1 = 0
            r8 = r1
        L6:
            boolean r2 = r0.hasNext()
            r3 = 1
            r9 = 2
            if (r2 == 0) goto L43
            java.lang.Object r2 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r2 = (androidx.fragment.app.SpecialEffectsController.Operation) r2
            androidx.fragment.app.Fragment r4 = r2.getFragment()
            android.view.View r4 = r4.mView
            androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r4)
            int[] r5 = androidx.fragment.app.DefaultSpecialEffectsController.AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State
            androidx.fragment.app.SpecialEffectsController$Operation$State r6 = r2.getFinalState()
            int r6 = r6.ordinal()
            r5 = r5[r6]
            if (r5 == r3) goto L3b
            if (r5 == r9) goto L3b
            r3 = 3
            if (r5 == r3) goto L3b
            r3 = 4
            if (r5 == r3) goto L35
            goto L6
        L35:
            androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r4 == r3) goto L6
            r8 = r2
            goto L6
        L3b:
            androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r4 != r3) goto L6
            if (r1 != 0) goto L6
            r1 = r2
            goto L6
        L43:
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r9)
            java.lang.String r10 = " to "
            java.lang.String r11 = "FragmentManager"
            if (r0 == 0) goto L67
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Executing operations from "
            r0.append(r2)
            r0.append(r1)
            r0.append(r10)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r11, r0)
        L67:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r14)
            r13.syncAnimations(r14)
            java.util.Iterator r14 = r14.iterator()
        L7d:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto Lbb
            java.lang.Object r2 = r14.next()
            androidx.fragment.app.SpecialEffectsController$Operation r2 = (androidx.fragment.app.SpecialEffectsController.Operation) r2
            androidx.core.os.CancellationSignal r5 = new androidx.core.os.CancellationSignal
            r5.<init>()
            r2.markStartedSpecialEffect(r5)
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r6 = new androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo
            r6.<init>(r2, r5, r15)
            r0.add(r6)
            androidx.core.os.CancellationSignal r5 = new androidx.core.os.CancellationSignal
            r5.<init>()
            r2.markStartedSpecialEffect(r5)
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r6 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo
            r7 = 0
            if (r15 == 0) goto La9
            if (r2 != r1) goto Lac
            goto Lab
        La9:
            if (r2 != r8) goto Lac
        Lab:
            r7 = 1
        Lac:
            r6.<init>(r2, r5, r15, r7)
            r4.add(r6)
            androidx.fragment.app.DefaultSpecialEffectsController$1 r5 = new androidx.fragment.app.DefaultSpecialEffectsController$1
            r5.<init>(r13, r12, r2)
            r2.addCompletionListener(r5)
            goto L7d
        Lbb:
            r2 = r13
            r3 = r4
            r4 = r12
            r5 = r15
            r6 = r1
            r7 = r8
            java.util.Map r14 = r2.startTransitions(r3, r4, r5, r6, r7)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            boolean r15 = r14.containsValue(r15)
            r13.startAnimations(r0, r12, r15, r14)
            java.util.Iterator r14 = r12.iterator()
        Ld2:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto Le2
            java.lang.Object r15 = r14.next()
            androidx.fragment.app.SpecialEffectsController$Operation r15 = (androidx.fragment.app.SpecialEffectsController.Operation) r15
            r13.applyContainerChanges(r15)
            goto Ld2
        Le2:
            r12.clear()
            boolean r14 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r9)
            if (r14 == 0) goto L105
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Completed executing operations from "
            r14.append(r15)
            r14.append(r1)
            r14.append(r10)
            r14.append(r8)
            java.lang.String r14 = r14.toString()
            android.util.Log.v(r11, r14)
        L105:
            return
    }

    void findNamedViews(java.util.Map<java.lang.String, android.view.View> r5, android.view.View r6) {
            r4 = this;
            java.lang.String r0 = androidx.core.view.ViewCompat.getTransitionName(r6)
            if (r0 == 0) goto L9
            r5.put(r0, r6)
        L9:
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L26
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r0 = r6.getChildCount()
            r1 = 0
        L14:
            if (r1 >= r0) goto L26
            android.view.View r2 = r6.getChildAt(r1)
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L23
            r4.findNamedViews(r5, r2)
        L23:
            int r1 = r1 + 1
            goto L14
        L26:
            return
    }

    void retainMatchingViews(androidx.collection.ArrayMap<java.lang.String, android.view.View> r2, java.util.Collection<java.lang.String> r3) {
            r1 = this;
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            java.lang.String r0 = androidx.core.view.ViewCompat.getTransitionName(r0)
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L8
            r2.remove()
            goto L8
        L28:
            return
    }
}
