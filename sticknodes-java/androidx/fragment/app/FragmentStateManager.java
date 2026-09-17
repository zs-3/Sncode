package androidx.fragment.app;

/* loaded from: classes.dex */
class FragmentStateManager {
    private final androidx.fragment.app.FragmentLifecycleCallbacksDispatcher mDispatcher;
    private final androidx.fragment.app.Fragment mFragment;
    private int mFragmentManagerState;
    private final androidx.fragment.app.FragmentStore mFragmentStore;
    private boolean mMovingToState;


    /* renamed from: androidx.fragment.app.FragmentStateManager$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$State = null;

        static {
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State = r0
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    FragmentStateManager(androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2, androidx.fragment.app.FragmentStore r3, androidx.fragment.app.Fragment r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mMovingToState = r0
            r0 = -1
            r1.mFragmentManagerState = r0
            r1.mDispatcher = r2
            r1.mFragmentStore = r3
            r1.mFragment = r4
            return
    }

    FragmentStateManager(androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r3, androidx.fragment.app.FragmentStore r4, androidx.fragment.app.Fragment r5, androidx.fragment.app.FragmentState r6) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mMovingToState = r0
            r1 = -1
            r2.mFragmentManagerState = r1
            r2.mDispatcher = r3
            r2.mFragmentStore = r4
            r2.mFragment = r5
            r3 = 0
            r5.mSavedViewState = r3
            r5.mSavedViewRegistryState = r3
            r5.mBackStackNesting = r0
            r5.mInLayout = r0
            r5.mAdded = r0
            androidx.fragment.app.Fragment r4 = r5.mTarget
            if (r4 == 0) goto L21
            java.lang.String r4 = r4.mWho
            goto L22
        L21:
            r4 = r3
        L22:
            r5.mTargetWho = r4
            r5.mTarget = r3
            android.os.Bundle r3 = r6.mSavedFragmentState
            if (r3 == 0) goto L2d
            r5.mSavedFragmentState = r3
            goto L34
        L2d:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r5.mSavedFragmentState = r3
        L34:
            return
    }

    FragmentStateManager(androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2, androidx.fragment.app.FragmentStore r3, java.lang.ClassLoader r4, androidx.fragment.app.FragmentFactory r5, androidx.fragment.app.FragmentState r6) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mMovingToState = r0
            r0 = -1
            r1.mFragmentManagerState = r0
            r1.mDispatcher = r2
            r1.mFragmentStore = r3
            androidx.fragment.app.Fragment r2 = r6.instantiate(r5, r4)
            r1.mFragment = r2
            r3 = 2
            boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r3 == 0) goto L30
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Instantiated fragment "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r2)
        L30:
            return
    }

    private boolean isFragmentViewChild(android.view.View r3) {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.mFragment
            android.view.View r0 = r0.mView
            r1 = 1
            if (r3 != r0) goto L8
            return r1
        L8:
            android.view.ViewParent r3 = r3.getParent()
        Lc:
            if (r3 == 0) goto L1a
            androidx.fragment.app.Fragment r0 = r2.mFragment
            android.view.View r0 = r0.mView
            if (r3 != r0) goto L15
            return r1
        L15:
            android.view.ViewParent r3 = r3.getParent()
            goto Lc
        L1a:
            r3 = 0
            return r3
    }

    private android.os.Bundle saveBasicState() {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.fragment.app.Fragment r1 = r4.mFragment
            r1.performSaveInstanceState(r0)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r4.mDispatcher
            androidx.fragment.app.Fragment r2 = r4.mFragment
            r3 = 0
            r1.dispatchOnFragmentSaveInstanceState(r2, r0, r3)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L19
            r0 = 0
        L19:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.view.View r1 = r1.mView
            if (r1 == 0) goto L22
            r4.saveViewState()
        L22:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.util.SparseArray<android.os.Parcelable> r1 = r1.mSavedViewState
            if (r1 == 0) goto L38
            if (r0 != 0) goto L2f
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L2f:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.util.SparseArray<android.os.Parcelable> r1 = r1.mSavedViewState
            java.lang.String r2 = "android:view_state"
            r0.putSparseParcelableArray(r2, r1)
        L38:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r1 = r1.mSavedViewRegistryState
            if (r1 == 0) goto L4e
            if (r0 != 0) goto L45
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L45:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r1 = r1.mSavedViewRegistryState
            java.lang.String r2 = "android:view_registry_state"
            r0.putBundle(r2, r1)
        L4e:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            boolean r1 = r1.mUserVisibleHint
            if (r1 != 0) goto L64
            if (r0 != 0) goto L5b
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L5b:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            boolean r1 = r1.mUserVisibleHint
            java.lang.String r2 = "android:user_visible_hint"
            r0.putBoolean(r2, r1)
        L64:
            return r0
    }

    void activityCreated() {
            r4 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto ACTIVITY_CREATED: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.mFragment
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1f:
            androidx.fragment.app.Fragment r0 = r4.mFragment
            android.os.Bundle r1 = r0.mSavedFragmentState
            r0.performActivityCreated(r1)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r4.mDispatcher
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r2 = r1.mSavedFragmentState
            r3 = 0
            r0.dispatchOnFragmentActivityCreated(r1, r2, r3)
            return
    }

    void addViewToContainer() {
            r3 = this;
            androidx.fragment.app.FragmentStore r0 = r3.mFragmentStore
            androidx.fragment.app.Fragment r1 = r3.mFragment
            int r0 = r0.findFragmentIndexInContainer(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            android.view.ViewGroup r2 = r1.mContainer
            android.view.View r1 = r1.mView
            r2.addView(r1, r0)
            return
    }

    void attach() {
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto ATTACHED: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r6.mFragment
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1f:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            androidx.fragment.app.Fragment r1 = r0.mTarget
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            java.lang.String r3 = " declared target fragment "
            java.lang.String r4 = "Fragment "
            r5 = 0
            if (r1 == 0) goto L66
            androidx.fragment.app.FragmentStore r0 = r6.mFragmentStore
            java.lang.String r1 = r1.mWho
            androidx.fragment.app.FragmentStateManager r0 = r0.getFragmentStateManager(r1)
            if (r0 == 0) goto L42
            androidx.fragment.app.Fragment r1 = r6.mFragment
            androidx.fragment.app.Fragment r2 = r1.mTarget
            java.lang.String r2 = r2.mWho
            r1.mTargetWho = r2
            r1.mTarget = r5
            r5 = r0
            goto L97
        L42:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            androidx.fragment.app.Fragment r4 = r6.mFragment
            r1.append(r4)
            r1.append(r3)
            androidx.fragment.app.Fragment r3 = r6.mFragment
            androidx.fragment.app.Fragment r3 = r3.mTarget
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L66:
            java.lang.String r0 = r0.mTargetWho
            if (r0 == 0) goto L97
            androidx.fragment.app.FragmentStore r1 = r6.mFragmentStore
            androidx.fragment.app.FragmentStateManager r5 = r1.getFragmentStateManager(r0)
            if (r5 == 0) goto L73
            goto L97
        L73:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            androidx.fragment.app.Fragment r4 = r6.mFragment
            r1.append(r4)
            r1.append(r3)
            androidx.fragment.app.Fragment r3 = r6.mFragment
            java.lang.String r3 = r3.mTargetWho
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L97:
            if (r5 == 0) goto L9c
            r5.moveToExpectedState()
        L9c:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            androidx.fragment.app.FragmentManager r1 = r0.mFragmentManager
            androidx.fragment.app.FragmentHostCallback r1 = r1.getHost()
            r0.mHost = r1
            androidx.fragment.app.Fragment r0 = r6.mFragment
            androidx.fragment.app.FragmentManager r1 = r0.mFragmentManager
            androidx.fragment.app.Fragment r1 = r1.getParent()
            r0.mParentFragment = r1
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r6.mDispatcher
            androidx.fragment.app.Fragment r1 = r6.mFragment
            r2 = 0
            r0.dispatchOnFragmentPreAttached(r1, r2)
            androidx.fragment.app.Fragment r0 = r6.mFragment
            r0.performAttach()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r6.mDispatcher
            androidx.fragment.app.Fragment r1 = r6.mFragment
            r0.dispatchOnFragmentAttached(r1, r2)
            return
    }

    int computeExpectedState() {
            r10 = this;
            androidx.fragment.app.Fragment r0 = r10.mFragment
            androidx.fragment.app.FragmentManager r1 = r0.mFragmentManager
            if (r1 != 0) goto L9
            int r0 = r0.mState
            return r0
        L9:
            int r1 = r10.mFragmentManagerState
            int[] r2 = androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State
            androidx.lifecycle.Lifecycle$State r0 = r0.mMaxState
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = -1
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            if (r0 == r7) goto L37
            if (r0 == r6) goto L33
            if (r0 == r4) goto L2e
            if (r0 == r5) goto L28
            int r1 = java.lang.Math.min(r1, r2)
            goto L37
        L28:
            r0 = 0
            int r1 = java.lang.Math.min(r1, r0)
            goto L37
        L2e:
            int r1 = java.lang.Math.min(r1, r7)
            goto L37
        L33:
            int r1 = java.lang.Math.min(r1, r3)
        L37:
            androidx.fragment.app.Fragment r0 = r10.mFragment
            boolean r8 = r0.mFromLayout
            if (r8 == 0) goto L67
            boolean r8 = r0.mInLayout
            if (r8 == 0) goto L58
            int r0 = r10.mFragmentManagerState
            int r1 = java.lang.Math.max(r0, r6)
            androidx.fragment.app.Fragment r0 = r10.mFragment
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L67
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L67
            int r1 = java.lang.Math.min(r1, r6)
            goto L67
        L58:
            int r8 = r10.mFragmentManagerState
            if (r8 >= r5) goto L63
            int r0 = r0.mState
            int r1 = java.lang.Math.min(r1, r0)
            goto L67
        L63:
            int r1 = java.lang.Math.min(r1, r7)
        L67:
            androidx.fragment.app.Fragment r0 = r10.mFragment
            boolean r0 = r0.mAdded
            if (r0 != 0) goto L71
            int r1 = java.lang.Math.min(r1, r7)
        L71:
            r0 = 0
            androidx.fragment.app.Fragment r8 = r10.mFragment
            android.view.ViewGroup r9 = r8.mContainer
            if (r9 == 0) goto L84
            androidx.fragment.app.FragmentManager r0 = r8.getParentFragmentManager()
            androidx.fragment.app.SpecialEffectsController r0 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r9, r0)
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = r0.getAwaitingCompletionLifecycleImpact(r10)
        L84:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r8 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
            if (r0 != r8) goto L8e
            r0 = 6
            int r1 = java.lang.Math.min(r1, r0)
            goto Lac
        L8e:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r8 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING
            if (r0 != r8) goto L97
            int r1 = java.lang.Math.max(r1, r4)
            goto Lac
        L97:
            androidx.fragment.app.Fragment r0 = r10.mFragment
            boolean r4 = r0.mRemoving
            if (r4 == 0) goto Lac
            boolean r0 = r0.isInBackStack()
            if (r0 == 0) goto La8
            int r1 = java.lang.Math.min(r1, r7)
            goto Lac
        La8:
            int r1 = java.lang.Math.min(r1, r2)
        Lac:
            androidx.fragment.app.Fragment r0 = r10.mFragment
            boolean r2 = r0.mDeferStart
            if (r2 == 0) goto Lba
            int r0 = r0.mState
            if (r0 >= r3) goto Lba
            int r1 = java.lang.Math.min(r1, r5)
        Lba:
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r6)
            if (r0 == 0) goto Le0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "computeExpectedState() of "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = " for "
            r0.append(r2)
            androidx.fragment.app.Fragment r2 = r10.mFragment
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r0)
        Le0:
            return r1
    }

    void create() {
            r4 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATED: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.mFragment
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1f:
            androidx.fragment.app.Fragment r0 = r4.mFragment
            boolean r1 = r0.mIsCreated
            if (r1 != 0) goto L3e
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r4.mDispatcher
            android.os.Bundle r2 = r0.mSavedFragmentState
            r3 = 0
            r1.dispatchOnFragmentPreCreated(r0, r2, r3)
            androidx.fragment.app.Fragment r0 = r4.mFragment
            android.os.Bundle r1 = r0.mSavedFragmentState
            r0.performCreate(r1)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r4.mDispatcher
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r2 = r1.mSavedFragmentState
            r0.dispatchOnFragmentCreated(r1, r2, r3)
            goto L48
        L3e:
            android.os.Bundle r1 = r0.mSavedFragmentState
            r0.restoreChildFragmentState(r1)
            androidx.fragment.app.Fragment r0 = r4.mFragment
            r1 = 1
            r0.mState = r1
        L48:
            return
    }

    void createView() {
            r7 = this;
            androidx.fragment.app.Fragment r0 = r7.mFragment
            boolean r0 = r0.mFromLayout
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r1 = "FragmentManager"
            if (r0 == 0) goto L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "moveto CREATE_VIEW: "
            r0.append(r2)
            androidx.fragment.app.Fragment r2 = r7.mFragment
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L26:
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.os.Bundle r2 = r0.mSavedFragmentState
            android.view.LayoutInflater r0 = r0.performGetLayoutInflater(r2)
            r2 = 0
            androidx.fragment.app.Fragment r3 = r7.mFragment
            android.view.ViewGroup r4 = r3.mContainer
            if (r4 == 0) goto L38
            r2 = r4
            goto Lc0
        L38:
            int r4 = r3.mContainerId
            if (r4 == 0) goto Lc0
            r2 = -1
            if (r4 == r2) goto La2
            androidx.fragment.app.FragmentManager r2 = r3.mFragmentManager
            androidx.fragment.app.FragmentContainer r2 = r2.getContainer()
            androidx.fragment.app.Fragment r3 = r7.mFragment
            int r3 = r3.mContainerId
            android.view.View r2 = r2.onFindViewById(r3)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L98
            androidx.fragment.app.Fragment r3 = r7.mFragment
            boolean r4 = r3.mRestored
            if (r4 == 0) goto L58
            goto Lc0
        L58:
            android.content.res.Resources r0 = r3.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L65
            androidx.fragment.app.Fragment r1 = r7.mFragment     // Catch: android.content.res.Resources.NotFoundException -> L65
            int r1 = r1.mContainerId     // Catch: android.content.res.Resources.NotFoundException -> L65
            java.lang.String r0 = r0.getResourceName(r1)     // Catch: android.content.res.Resources.NotFoundException -> L65
            goto L67
        L65:
            java.lang.String r0 = "unknown"
        L67:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No view found for id 0x"
            r2.append(r3)
            androidx.fragment.app.Fragment r3 = r7.mFragment
            int r3 = r3.mContainerId
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            androidx.fragment.app.Fragment r0 = r7.mFragment
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L98:
            boolean r3 = r2 instanceof androidx.fragment.app.FragmentContainerView
            if (r3 != 0) goto Lc0
            androidx.fragment.app.Fragment r3 = r7.mFragment
            androidx.fragment.app.strictmode.FragmentStrictMode.onWrongFragmentContainer(r3, r2)
            goto Lc0
        La2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            androidx.fragment.app.Fragment r2 = r7.mFragment
            r1.append(r2)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lc0:
            androidx.fragment.app.Fragment r3 = r7.mFragment
            r3.mContainer = r2
            android.os.Bundle r4 = r3.mSavedFragmentState
            r3.performCreateView(r0, r2, r4)
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r0 = r0.mView
            r3 = 2
            if (r0 == 0) goto L173
            r4 = 0
            r0.setSaveFromParentEnabled(r4)
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r5 = r0.mView
            int r6 = androidx.fragment.R$id.fragment_container_view_tag
            r5.setTag(r6, r0)
            if (r2 == 0) goto Le2
            r7.addViewToContainer()
        Le2:
            androidx.fragment.app.Fragment r0 = r7.mFragment
            boolean r2 = r0.mHidden
            if (r2 == 0) goto Lef
            android.view.View r0 = r0.mView
            r2 = 8
            r0.setVisibility(r2)
        Lef:
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r0 = r0.mView
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
            if (r0 == 0) goto L101
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r0 = r0.mView
            androidx.core.view.ViewCompat.requestApplyInsets(r0)
            goto L10d
        L101:
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r0 = r0.mView
            androidx.fragment.app.FragmentStateManager$1 r2 = new androidx.fragment.app.FragmentStateManager$1
            r2.<init>(r7, r0)
            r0.addOnAttachStateChangeListener(r2)
        L10d:
            androidx.fragment.app.Fragment r0 = r7.mFragment
            r0.performViewCreated()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r7.mDispatcher
            androidx.fragment.app.Fragment r2 = r7.mFragment
            android.view.View r5 = r2.mView
            android.os.Bundle r6 = r2.mSavedFragmentState
            r0.dispatchOnFragmentViewCreated(r2, r5, r6, r4)
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r0 = r0.mView
            int r0 = r0.getVisibility()
            androidx.fragment.app.Fragment r2 = r7.mFragment
            android.view.View r2 = r2.mView
            float r2 = r2.getAlpha()
            androidx.fragment.app.Fragment r4 = r7.mFragment
            r4.setPostOnViewCreatedAlpha(r2)
            androidx.fragment.app.Fragment r2 = r7.mFragment
            android.view.ViewGroup r4 = r2.mContainer
            if (r4 == 0) goto L173
            if (r0 != 0) goto L173
            android.view.View r0 = r2.mView
            android.view.View r0 = r0.findFocus()
            if (r0 == 0) goto L16b
            androidx.fragment.app.Fragment r2 = r7.mFragment
            r2.setFocusedView(r0)
            boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r2 == 0) goto L16b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "requestFocus: Saved focused view "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = " for Fragment "
            r2.append(r0)
            androidx.fragment.app.Fragment r0 = r7.mFragment
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.v(r1, r0)
        L16b:
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r0 = r0.mView
            r1 = 0
            r0.setAlpha(r1)
        L173:
            androidx.fragment.app.Fragment r0 = r7.mFragment
            r0.mState = r3
            return
    }

    void destroy() {
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom CREATED: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r6.mFragment
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1f:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            boolean r1 = r0.mRemoving
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2f
            boolean r0 = r0.isInBackStack()
            if (r0 != 0) goto L2f
            r0 = 1
            goto L30
        L2f:
            r0 = 0
        L30:
            r1 = 0
            if (r0 == 0) goto L40
            androidx.fragment.app.Fragment r4 = r6.mFragment
            boolean r5 = r4.mBeingSaved
            if (r5 != 0) goto L40
            androidx.fragment.app.FragmentStore r5 = r6.mFragmentStore
            java.lang.String r4 = r4.mWho
            r5.setSavedState(r4, r1)
        L40:
            if (r0 != 0) goto L53
            androidx.fragment.app.FragmentStore r4 = r6.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r4 = r4.getNonConfig()
            androidx.fragment.app.Fragment r5 = r6.mFragment
            boolean r4 = r4.shouldDestroy(r5)
            if (r4 == 0) goto L51
            goto L53
        L51:
            r4 = 0
            goto L54
        L53:
            r4 = 1
        L54:
            if (r4 == 0) goto Le0
            androidx.fragment.app.Fragment r4 = r6.mFragment
            androidx.fragment.app.FragmentHostCallback<?> r4 = r4.mHost
            boolean r5 = r4 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r5 == 0) goto L69
            androidx.fragment.app.FragmentStore r2 = r6.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r2 = r2.getNonConfig()
            boolean r2 = r2.isCleared()
            goto L7c
        L69:
            android.content.Context r5 = r4.getContext()
            boolean r5 = r5 instanceof android.app.Activity
            if (r5 == 0) goto L7c
            android.content.Context r4 = r4.getContext()
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r4 = r4.isChangingConfigurations()
            r2 = r2 ^ r4
        L7c:
            if (r0 == 0) goto L84
            androidx.fragment.app.Fragment r0 = r6.mFragment
            boolean r0 = r0.mBeingSaved
            if (r0 == 0) goto L86
        L84:
            if (r2 == 0) goto L91
        L86:
            androidx.fragment.app.FragmentStore r0 = r6.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r0 = r0.getNonConfig()
            androidx.fragment.app.Fragment r2 = r6.mFragment
            r0.clearNonConfigState(r2)
        L91:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            r0.performDestroy()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r6.mDispatcher
            androidx.fragment.app.Fragment r2 = r6.mFragment
            r0.dispatchOnFragmentDestroyed(r2, r3)
            androidx.fragment.app.FragmentStore r0 = r6.mFragmentStore
            java.util.List r0 = r0.getActiveFragmentStateManagers()
            java.util.Iterator r0 = r0.iterator()
        La7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lcc
            java.lang.Object r2 = r0.next()
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            if (r2 == 0) goto La7
            androidx.fragment.app.Fragment r2 = r2.getFragment()
            androidx.fragment.app.Fragment r3 = r6.mFragment
            java.lang.String r3 = r3.mWho
            java.lang.String r4 = r2.mTargetWho
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La7
            androidx.fragment.app.Fragment r3 = r6.mFragment
            r2.mTarget = r3
            r2.mTargetWho = r1
            goto La7
        Lcc:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            java.lang.String r1 = r0.mTargetWho
            if (r1 == 0) goto Lda
            androidx.fragment.app.FragmentStore r2 = r6.mFragmentStore
            androidx.fragment.app.Fragment r1 = r2.findActiveFragment(r1)
            r0.mTarget = r1
        Lda:
            androidx.fragment.app.FragmentStore r0 = r6.mFragmentStore
            r0.makeInactive(r6)
            goto Lfa
        Le0:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            java.lang.String r0 = r0.mTargetWho
            if (r0 == 0) goto Lf6
            androidx.fragment.app.FragmentStore r1 = r6.mFragmentStore
            androidx.fragment.app.Fragment r0 = r1.findActiveFragment(r0)
            if (r0 == 0) goto Lf6
            boolean r1 = r0.mRetainInstance
            if (r1 == 0) goto Lf6
            androidx.fragment.app.Fragment r1 = r6.mFragment
            r1.mTarget = r0
        Lf6:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            r0.mState = r3
        Lfa:
            return
    }

    void destroyFragmentView() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom CREATE_VIEW: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1f:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.view.ViewGroup r1 = r0.mContainer
            if (r1 == 0) goto L2c
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L2c
            r1.removeView(r0)
        L2c:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performDestroyView()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentViewDestroyed(r1, r2)
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r1 = 0
            r0.mContainer = r1
            r0.mView = r1
            r0.mViewLifecycleOwner = r1
            androidx.lifecycle.MutableLiveData<androidx.lifecycle.LifecycleOwner> r0 = r0.mViewLifecycleOwnerLiveData
            r0.setValue(r1)
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.mInLayout = r2
            return
    }

    void detach() {
            r5 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "movefrom ATTACHED: "
            r1.append(r3)
            androidx.fragment.app.Fragment r3 = r5.mFragment
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L1f:
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r1.performDetach()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r5.mDispatcher
            androidx.fragment.app.Fragment r3 = r5.mFragment
            r4 = 0
            r1.dispatchOnFragmentDetached(r3, r4)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r3 = -1
            r1.mState = r3
            r3 = 0
            r1.mHost = r3
            r1.mParentFragment = r3
            r1.mFragmentManager = r3
            boolean r3 = r1.mRemoving
            if (r3 == 0) goto L43
            boolean r1 = r1.isInBackStack()
            if (r1 != 0) goto L43
            r4 = 1
        L43:
            if (r4 != 0) goto L53
            androidx.fragment.app.FragmentStore r1 = r5.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r1 = r1.getNonConfig()
            androidx.fragment.app.Fragment r3 = r5.mFragment
            boolean r1 = r1.shouldDestroy(r3)
            if (r1 == 0) goto L74
        L53:
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L6f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "initState called for fragment: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L6f:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r0.initState()
        L74:
            return
    }

    void ensureInflatedView() {
            r5 = this;
            androidx.fragment.app.Fragment r0 = r5.mFragment
            boolean r1 = r0.mFromLayout
            if (r1 == 0) goto L72
            boolean r1 = r0.mInLayout
            if (r1 == 0) goto L72
            boolean r0 = r0.mPerformedCreateView
            if (r0 != 0) goto L72
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L2d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATE_VIEW: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L2d:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.os.Bundle r1 = r0.mSavedFragmentState
            android.view.LayoutInflater r1 = r0.performGetLayoutInflater(r1)
            r2 = 0
            androidx.fragment.app.Fragment r3 = r5.mFragment
            android.os.Bundle r3 = r3.mSavedFragmentState
            r0.performCreateView(r1, r2, r3)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L72
            r1 = 0
            r0.setSaveFromParentEnabled(r1)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.view.View r2 = r0.mView
            int r3 = androidx.fragment.R$id.fragment_container_view_tag
            r2.setTag(r3, r0)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            boolean r2 = r0.mHidden
            if (r2 == 0) goto L5d
            android.view.View r0 = r0.mView
            r2 = 8
            r0.setVisibility(r2)
        L5d:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r0.performViewCreated()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r5.mDispatcher
            androidx.fragment.app.Fragment r2 = r5.mFragment
            android.view.View r3 = r2.mView
            android.os.Bundle r4 = r2.mSavedFragmentState
            r0.dispatchOnFragmentViewCreated(r2, r3, r4, r1)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r1 = 2
            r0.mState = r1
        L72:
            return
    }

    androidx.fragment.app.Fragment getFragment() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.mFragment
            return r0
    }

    void moveToExpectedState() {
            r9 = this;
            boolean r0 = r9.mMovingToState
            r1 = 2
            java.lang.String r2 = "FragmentManager"
            if (r0 == 0) goto L26
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r1)
            if (r0 == 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring re-entrant call to moveToExpectedState() for "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r9.getFragment()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L25:
            return
        L26:
            r0 = 0
            r3 = 1
            r9.mMovingToState = r3     // Catch: java.lang.Throwable -> L1b5
            r4 = 0
        L2b:
            int r5 = r9.computeExpectedState()     // Catch: java.lang.Throwable -> L1b5
            androidx.fragment.app.Fragment r6 = r9.mFragment     // Catch: java.lang.Throwable -> L1b5
            int r7 = r6.mState     // Catch: java.lang.Throwable -> L1b5
            r8 = 3
            if (r5 == r7) goto L114
            if (r5 <= r7) goto L8b
            int r7 = r7 + 1
            switch(r7) {
                case 0: goto L86;
                case 1: goto L81;
                case 2: goto L79;
                case 3: goto L74;
                case 4: goto L4e;
                case 5: goto L49;
                case 6: goto L44;
                case 7: goto L3f;
                default: goto L3d;
            }     // Catch: java.lang.Throwable -> L1b5
        L3d:
            goto L111
        L3f:
            r9.resume()     // Catch: java.lang.Throwable -> L1b5
            goto L111
        L44:
            r4 = 6
            r6.mState = r4     // Catch: java.lang.Throwable -> L1b5
            goto L111
        L49:
            r9.start()     // Catch: java.lang.Throwable -> L1b5
            goto L111
        L4e:
            android.view.View r4 = r6.mView     // Catch: java.lang.Throwable -> L1b5
            if (r4 == 0) goto L6d
            android.view.ViewGroup r4 = r6.mContainer     // Catch: java.lang.Throwable -> L1b5
            if (r4 == 0) goto L6d
            androidx.fragment.app.FragmentManager r5 = r6.getParentFragmentManager()     // Catch: java.lang.Throwable -> L1b5
            androidx.fragment.app.SpecialEffectsController r4 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r4, r5)     // Catch: java.lang.Throwable -> L1b5
            androidx.fragment.app.Fragment r5 = r9.mFragment     // Catch: java.lang.Throwable -> L1b5
            android.view.View r5 = r5.mView     // Catch: java.lang.Throwable -> L1b5
            int r5 = r5.getVisibility()     // Catch: java.lang.Throwable -> L1b5
            androidx.fragment.app.SpecialEffectsController$Operation$State r5 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r5)     // Catch: java.lang.Throwable -> L1b5
            r4.enqueueAdd(r5, r9)     // Catch: java.lang.Throwable -> L1b5
        L6d:
            androidx.fragment.app.Fragment r4 = r9.mFragment     // Catch: java.lang.Throwable -> L1b5
            r5 = 4
            r4.mState = r5     // Catch: java.lang.Throwable -> L1b5
            goto L111
        L74:
            r9.activityCreated()     // Catch: java.lang.Throwable -> L1b5
            goto L111
        L79:
            r9.ensureInflatedView()     // Catch: java.lang.Throwable -> L1b5
            r9.createView()     // Catch: java.lang.Throwable -> L1b5
            goto L111
        L81:
            r9.create()     // Catch: java.lang.Throwable -> L1b5
            goto L111
        L86:
            r9.attach()     // Catch: java.lang.Throwable -> L1b5
            goto L111
        L8b:
            int r7 = r7 + (-1)
            switch(r7) {
                case -1: goto L10e;
                case 0: goto Lf9;
                case 1: goto Lf1;
                case 2: goto Lec;
                case 3: goto La1;
                case 4: goto L9c;
                case 5: goto L97;
                case 6: goto L92;
                default: goto L90;
            }     // Catch: java.lang.Throwable -> L1b5
        L90:
            goto L111
        L92:
            r9.pause()     // Catch: java.lang.Throwable -> L1b5
            goto L111
        L97:
            r4 = 5
            r6.mState = r4     // Catch: java.lang.Throwable -> L1b5
            goto L111
        L9c:
            r9.stop()     // Catch: java.lang.Throwable -> L1b5
            goto L111
        La1:
            boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r8)     // Catch: java.lang.Throwable -> L1b5
            if (r4 == 0) goto Lbd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b5
            r4.<init>()     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r5 = "movefrom ACTIVITY_CREATED: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L1b5
            androidx.fragment.app.Fragment r5 = r9.mFragment     // Catch: java.lang.Throwable -> L1b5
            r4.append(r5)     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L1b5
            android.util.Log.d(r2, r4)     // Catch: java.lang.Throwable -> L1b5
        Lbd:
            androidx.fragment.app.Fragment r4 = r9.mFragment     // Catch: java.lang.Throwable -> L1b5
            boolean r5 = r4.mBeingSaved     // Catch: java.lang.Throwable -> L1b5
            if (r5 == 0) goto Lc7
            r9.saveState()     // Catch: java.lang.Throwable -> L1b5
            goto Ld2
        Lc7:
            android.view.View r5 = r4.mView     // Catch: java.lang.Throwable -> L1b5
            if (r5 == 0) goto Ld2
            android.util.SparseArray<android.os.Parcelable> r4 = r4.mSavedViewState     // Catch: java.lang.Throwable -> L1b5
            if (r4 != 0) goto Ld2
            r9.saveViewState()     // Catch: java.lang.Throwable -> L1b5
        Ld2:
            androidx.fragment.app.Fragment r4 = r9.mFragment     // Catch: java.lang.Throwable -> L1b5
            android.view.View r5 = r4.mView     // Catch: java.lang.Throwable -> L1b5
            if (r5 == 0) goto Le7
            android.view.ViewGroup r5 = r4.mContainer     // Catch: java.lang.Throwable -> L1b5
            if (r5 == 0) goto Le7
            androidx.fragment.app.FragmentManager r4 = r4.getParentFragmentManager()     // Catch: java.lang.Throwable -> L1b5
            androidx.fragment.app.SpecialEffectsController r4 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r5, r4)     // Catch: java.lang.Throwable -> L1b5
            r4.enqueueRemove(r9)     // Catch: java.lang.Throwable -> L1b5
        Le7:
            androidx.fragment.app.Fragment r4 = r9.mFragment     // Catch: java.lang.Throwable -> L1b5
            r4.mState = r8     // Catch: java.lang.Throwable -> L1b5
            goto L111
        Lec:
            r6.mInLayout = r0     // Catch: java.lang.Throwable -> L1b5
            r6.mState = r1     // Catch: java.lang.Throwable -> L1b5
            goto L111
        Lf1:
            r9.destroyFragmentView()     // Catch: java.lang.Throwable -> L1b5
            androidx.fragment.app.Fragment r4 = r9.mFragment     // Catch: java.lang.Throwable -> L1b5
            r4.mState = r3     // Catch: java.lang.Throwable -> L1b5
            goto L111
        Lf9:
            boolean r4 = r6.mBeingSaved     // Catch: java.lang.Throwable -> L1b5
            if (r4 == 0) goto L10a
            androidx.fragment.app.FragmentStore r4 = r9.mFragmentStore     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r5 = r6.mWho     // Catch: java.lang.Throwable -> L1b5
            androidx.fragment.app.FragmentState r4 = r4.getSavedState(r5)     // Catch: java.lang.Throwable -> L1b5
            if (r4 != 0) goto L10a
            r9.saveState()     // Catch: java.lang.Throwable -> L1b5
        L10a:
            r9.destroy()     // Catch: java.lang.Throwable -> L1b5
            goto L111
        L10e:
            r9.detach()     // Catch: java.lang.Throwable -> L1b5
        L111:
            r4 = 1
            goto L2b
        L114:
            if (r4 != 0) goto L176
            r1 = -1
            if (r7 != r1) goto L176
            boolean r1 = r6.mRemoving     // Catch: java.lang.Throwable -> L1b5
            if (r1 == 0) goto L176
            boolean r1 = r6.isInBackStack()     // Catch: java.lang.Throwable -> L1b5
            if (r1 != 0) goto L176
            androidx.fragment.app.Fragment r1 = r9.mFragment     // Catch: java.lang.Throwable -> L1b5
            boolean r1 = r1.mBeingSaved     // Catch: java.lang.Throwable -> L1b5
            if (r1 != 0) goto L176
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r8)     // Catch: java.lang.Throwable -> L1b5
            if (r1 == 0) goto L145
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b5
            r1.<init>()     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r3 = "Cleaning up state of never attached fragment: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L1b5
            androidx.fragment.app.Fragment r3 = r9.mFragment     // Catch: java.lang.Throwable -> L1b5
            r1.append(r3)     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1b5
            android.util.Log.d(r2, r1)     // Catch: java.lang.Throwable -> L1b5
        L145:
            androidx.fragment.app.FragmentStore r1 = r9.mFragmentStore     // Catch: java.lang.Throwable -> L1b5
            androidx.fragment.app.FragmentManagerViewModel r1 = r1.getNonConfig()     // Catch: java.lang.Throwable -> L1b5
            androidx.fragment.app.Fragment r3 = r9.mFragment     // Catch: java.lang.Throwable -> L1b5
            r1.clearNonConfigState(r3)     // Catch: java.lang.Throwable -> L1b5
            androidx.fragment.app.FragmentStore r1 = r9.mFragmentStore     // Catch: java.lang.Throwable -> L1b5
            r1.makeInactive(r9)     // Catch: java.lang.Throwable -> L1b5
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r8)     // Catch: java.lang.Throwable -> L1b5
            if (r1 == 0) goto L171
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b5
            r1.<init>()     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r3 = "initState called for fragment: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L1b5
            androidx.fragment.app.Fragment r3 = r9.mFragment     // Catch: java.lang.Throwable -> L1b5
            r1.append(r3)     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1b5
            android.util.Log.d(r2, r1)     // Catch: java.lang.Throwable -> L1b5
        L171:
            androidx.fragment.app.Fragment r1 = r9.mFragment     // Catch: java.lang.Throwable -> L1b5
            r1.initState()     // Catch: java.lang.Throwable -> L1b5
        L176:
            androidx.fragment.app.Fragment r1 = r9.mFragment     // Catch: java.lang.Throwable -> L1b5
            boolean r2 = r1.mHiddenChanged     // Catch: java.lang.Throwable -> L1b5
            if (r2 == 0) goto L1b2
            android.view.View r2 = r1.mView     // Catch: java.lang.Throwable -> L1b5
            if (r2 == 0) goto L199
            android.view.ViewGroup r2 = r1.mContainer     // Catch: java.lang.Throwable -> L1b5
            if (r2 == 0) goto L199
            androidx.fragment.app.FragmentManager r1 = r1.getParentFragmentManager()     // Catch: java.lang.Throwable -> L1b5
            androidx.fragment.app.SpecialEffectsController r1 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r2, r1)     // Catch: java.lang.Throwable -> L1b5
            androidx.fragment.app.Fragment r2 = r9.mFragment     // Catch: java.lang.Throwable -> L1b5
            boolean r2 = r2.mHidden     // Catch: java.lang.Throwable -> L1b5
            if (r2 == 0) goto L196
            r1.enqueueHide(r9)     // Catch: java.lang.Throwable -> L1b5
            goto L199
        L196:
            r1.enqueueShow(r9)     // Catch: java.lang.Throwable -> L1b5
        L199:
            androidx.fragment.app.Fragment r1 = r9.mFragment     // Catch: java.lang.Throwable -> L1b5
            androidx.fragment.app.FragmentManager r2 = r1.mFragmentManager     // Catch: java.lang.Throwable -> L1b5
            if (r2 == 0) goto L1a2
            r2.invalidateMenuForFragment(r1)     // Catch: java.lang.Throwable -> L1b5
        L1a2:
            androidx.fragment.app.Fragment r1 = r9.mFragment     // Catch: java.lang.Throwable -> L1b5
            r1.mHiddenChanged = r0     // Catch: java.lang.Throwable -> L1b5
            boolean r2 = r1.mHidden     // Catch: java.lang.Throwable -> L1b5
            r1.onHiddenChanged(r2)     // Catch: java.lang.Throwable -> L1b5
            androidx.fragment.app.Fragment r1 = r9.mFragment     // Catch: java.lang.Throwable -> L1b5
            androidx.fragment.app.FragmentManager r1 = r1.mChildFragmentManager     // Catch: java.lang.Throwable -> L1b5
            r1.dispatchOnHiddenChanged()     // Catch: java.lang.Throwable -> L1b5
        L1b2:
            r9.mMovingToState = r0
            return
        L1b5:
            r1 = move-exception
            r9.mMovingToState = r0
            throw r1
    }

    void pause() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom RESUMED: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1f:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performPause()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentPaused(r1, r2)
            return
    }

    void restoreState(java.lang.ClassLoader r4) {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.os.Bundle r0 = r0.mSavedFragmentState
            if (r0 != 0) goto L7
            return
        L7:
            r0.setClassLoader(r4)
            androidx.fragment.app.Fragment r4 = r3.mFragment
            android.os.Bundle r0 = r4.mSavedFragmentState
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r4.mSavedViewState = r0
            androidx.fragment.app.Fragment r4 = r3.mFragment
            android.os.Bundle r0 = r4.mSavedFragmentState
            java.lang.String r1 = "android:view_registry_state"
            android.os.Bundle r0 = r0.getBundle(r1)
            r4.mSavedViewRegistryState = r0
            androidx.fragment.app.Fragment r4 = r3.mFragment
            android.os.Bundle r0 = r4.mSavedFragmentState
            java.lang.String r1 = "android:target_state"
            java.lang.String r0 = r0.getString(r1)
            r4.mTargetWho = r0
            androidx.fragment.app.Fragment r4 = r3.mFragment
            java.lang.String r0 = r4.mTargetWho
            if (r0 == 0) goto L3f
            android.os.Bundle r0 = r4.mSavedFragmentState
            r1 = 0
            java.lang.String r2 = "android:target_req_state"
            int r0 = r0.getInt(r2, r1)
            r4.mTargetRequestCode = r0
        L3f:
            androidx.fragment.app.Fragment r4 = r3.mFragment
            java.lang.Boolean r0 = r4.mSavedUserVisibleHint
            r1 = 1
            if (r0 == 0) goto L52
            boolean r0 = r0.booleanValue()
            r4.mUserVisibleHint = r0
            androidx.fragment.app.Fragment r4 = r3.mFragment
            r0 = 0
            r4.mSavedUserVisibleHint = r0
            goto L5c
        L52:
            android.os.Bundle r0 = r4.mSavedFragmentState
            java.lang.String r2 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r2, r1)
            r4.mUserVisibleHint = r0
        L5c:
            androidx.fragment.app.Fragment r4 = r3.mFragment
            boolean r0 = r4.mUserVisibleHint
            if (r0 != 0) goto L64
            r4.mDeferStart = r1
        L64:
            return
    }

    void resume() {
            r5 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r1 = "FragmentManager"
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "moveto RESUMED: "
            r0.append(r2)
            androidx.fragment.app.Fragment r2 = r5.mFragment
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1f:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.view.View r0 = r0.getFocusedView()
            if (r0 == 0) goto L75
            boolean r2 = r5.isFragmentViewChild(r0)
            if (r2 == 0) goto L75
            boolean r2 = r0.requestFocus()
            r3 = 2
            boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r3 == 0) goto L75
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "requestFocus: Restoring focused view "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " "
            r3.append(r0)
            if (r2 == 0) goto L4f
            java.lang.String r0 = "succeeded"
            goto L51
        L4f:
            java.lang.String r0 = "failed"
        L51:
            r3.append(r0)
            java.lang.String r0 = " on Fragment "
            r3.append(r0)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r3.append(r0)
            java.lang.String r0 = " resulting in focused view "
            r3.append(r0)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.view.View r0 = r0.mView
            android.view.View r0 = r0.findFocus()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.v(r1, r0)
        L75:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r1 = 0
            r0.setFocusedView(r1)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r0.performResume()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r5.mDispatcher
            androidx.fragment.app.Fragment r2 = r5.mFragment
            r3 = 0
            r0.dispatchOnFragmentResumed(r2, r3)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r0.mSavedFragmentState = r1
            r0.mSavedViewState = r1
            r0.mSavedViewRegistryState = r1
            return
    }

    void saveState() {
            r4 = this;
            androidx.fragment.app.FragmentState r0 = new androidx.fragment.app.FragmentState
            androidx.fragment.app.Fragment r1 = r4.mFragment
            r0.<init>(r1)
            androidx.fragment.app.Fragment r1 = r4.mFragment
            int r2 = r1.mState
            r3 = -1
            if (r2 <= r3) goto L40
            android.os.Bundle r2 = r0.mSavedFragmentState
            if (r2 != 0) goto L40
            android.os.Bundle r1 = r4.saveBasicState()
            r0.mSavedFragmentState = r1
            androidx.fragment.app.Fragment r2 = r4.mFragment
            java.lang.String r2 = r2.mTargetWho
            if (r2 == 0) goto L44
            if (r1 != 0) goto L27
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0.mSavedFragmentState = r1
        L27:
            android.os.Bundle r1 = r0.mSavedFragmentState
            androidx.fragment.app.Fragment r2 = r4.mFragment
            java.lang.String r2 = r2.mTargetWho
            java.lang.String r3 = "android:target_state"
            r1.putString(r3, r2)
            androidx.fragment.app.Fragment r1 = r4.mFragment
            int r1 = r1.mTargetRequestCode
            if (r1 == 0) goto L44
            android.os.Bundle r2 = r0.mSavedFragmentState
            java.lang.String r3 = "android:target_req_state"
            r2.putInt(r3, r1)
            goto L44
        L40:
            android.os.Bundle r1 = r1.mSavedFragmentState
            r0.mSavedFragmentState = r1
        L44:
            androidx.fragment.app.FragmentStore r1 = r4.mFragmentStore
            androidx.fragment.app.Fragment r2 = r4.mFragment
            java.lang.String r2 = r2.mWho
            r1.setSavedState(r2, r0)
            return
    }

    void saveViewState() {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.mFragment
            android.view.View r0 = r0.mView
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Saving view state for fragment "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r2.mFragment
            r0.append(r1)
            java.lang.String r1 = " with view "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r2.mFragment
            android.view.View r1 = r1.mView
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L32:
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            androidx.fragment.app.Fragment r1 = r2.mFragment
            android.view.View r1 = r1.mView
            r1.saveHierarchyState(r0)
            int r1 = r0.size()
            if (r1 <= 0) goto L48
            androidx.fragment.app.Fragment r1 = r2.mFragment
            r1.mSavedViewState = r0
        L48:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.fragment.app.Fragment r1 = r2.mFragment
            androidx.fragment.app.FragmentViewLifecycleOwner r1 = r1.mViewLifecycleOwner
            r1.performSave(r0)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L5e
            androidx.fragment.app.Fragment r1 = r2.mFragment
            r1.mSavedViewRegistryState = r0
        L5e:
            return
    }

    void setFragmentManagerState(int r1) {
            r0 = this;
            r0.mFragmentManagerState = r1
            return
    }

    void start() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto STARTED: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1f:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performStart()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentStarted(r1, r2)
            return
    }

    void stop() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom STARTED: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1f:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performStop()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentStopped(r1, r2)
            return
    }
}
