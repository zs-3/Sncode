package androidx.fragment.app;

/* loaded from: classes.dex */
final class BackStackRecord extends androidx.fragment.app.FragmentTransaction implements androidx.fragment.app.FragmentManager.OpGenerator {
    boolean mBeingSaved;
    boolean mCommitted;
    int mIndex;
    final androidx.fragment.app.FragmentManager mManager;

    BackStackRecord(androidx.fragment.app.FragmentManager r3) {
            r2 = this;
            androidx.fragment.app.FragmentFactory r0 = r3.getFragmentFactory()
            androidx.fragment.app.FragmentHostCallback r1 = r3.getHost()
            if (r1 == 0) goto L17
            androidx.fragment.app.FragmentHostCallback r1 = r3.getHost()
            android.content.Context r1 = r1.getContext()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L18
        L17:
            r1 = 0
        L18:
            r2.<init>(r0, r1)
            r0 = -1
            r2.mIndex = r0
            r0 = 0
            r2.mBeingSaved = r0
            r2.mManager = r3
            return
    }

    void bumpBackStackNesting(int r8) {
            r7 = this;
            boolean r0 = r7.mAddToBackStack
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 2
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Bump nesting in "
            r1.append(r3)
            r1.append(r7)
            java.lang.String r3 = " by "
            r1.append(r3)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L2a:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r7.mOps
            int r1 = r1.size()
            r3 = 0
        L31:
            if (r3 >= r1) goto L6f
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r4 = r7.mOps
            java.lang.Object r4 = r4.get(r3)
            androidx.fragment.app.FragmentTransaction$Op r4 = (androidx.fragment.app.FragmentTransaction.Op) r4
            androidx.fragment.app.Fragment r5 = r4.mFragment
            if (r5 == 0) goto L6c
            int r6 = r5.mBackStackNesting
            int r6 = r6 + r8
            r5.mBackStackNesting = r6
            boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r5 == 0) goto L6c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Bump nesting of "
            r5.append(r6)
            androidx.fragment.app.Fragment r6 = r4.mFragment
            r5.append(r6)
            java.lang.String r6 = " to "
            r5.append(r6)
            androidx.fragment.app.Fragment r4 = r4.mFragment
            int r4 = r4.mBackStackNesting
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.v(r2, r4)
        L6c:
            int r3 = r3 + 1
            goto L31
        L6f:
            return
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int commit() {
            r1 = this;
            r0 = 0
            int r0 = r1.commitInternal(r0)
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int commitAllowingStateLoss() {
            r1 = this;
            r0 = 1
            int r0 = r1.commitInternal(r0)
            return r0
    }

    int commitInternal(boolean r3) {
            r2 = this;
            boolean r0 = r2.mCommitted
            if (r0 != 0) goto L4e
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L33
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Commit: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
            androidx.fragment.app.LogWriter r0 = new androidx.fragment.app.LogWriter
            r0.<init>(r1)
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            java.lang.String r0 = "  "
            r2.dump(r0, r1)
            r1.close()
        L33:
            r0 = 1
            r2.mCommitted = r0
            boolean r0 = r2.mAddToBackStack
            if (r0 == 0) goto L43
            androidx.fragment.app.FragmentManager r0 = r2.mManager
            int r0 = r0.allocBackStackIndex()
            r2.mIndex = r0
            goto L46
        L43:
            r0 = -1
            r2.mIndex = r0
        L46:
            androidx.fragment.app.FragmentManager r0 = r2.mManager
            r0.enqueueAction(r2, r3)
            int r3 = r2.mIndex
            return r3
        L4e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "commit already called"
            r3.<init>(r0)
            throw r3
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void commitNow() {
            r2 = this;
            r2.disallowAddToBackStack()
            androidx.fragment.app.FragmentManager r0 = r2.mManager
            r1 = 0
            r0.execSingleAction(r2, r1)
            return
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void commitNowAllowingStateLoss() {
            r2 = this;
            r2.disallowAddToBackStack()
            androidx.fragment.app.FragmentManager r0 = r2.mManager
            r1 = 1
            r0.execSingleAction(r2, r1)
            return
    }

    @Override // androidx.fragment.app.FragmentTransaction
    void doAddOp(int r1, androidx.fragment.app.Fragment r2, java.lang.String r3, int r4) {
            r0 = this;
            super.doAddOp(r1, r2, r3, r4)
            androidx.fragment.app.FragmentManager r1 = r0.mManager
            r2.mFragmentManager = r1
            return
    }

    public void dump(java.lang.String r2, java.io.PrintWriter r3) {
            r1 = this;
            r0 = 1
            r1.dump(r2, r3, r0)
            return
    }

    public void dump(java.lang.String r6, java.io.PrintWriter r7, boolean r8) {
            r5 = this;
            if (r8 == 0) goto Lcc
            r7.print(r6)
            java.lang.String r0 = "mName="
            r7.print(r0)
            java.lang.String r0 = r5.mName
            r7.print(r0)
            java.lang.String r0 = " mIndex="
            r7.print(r0)
            int r0 = r5.mIndex
            r7.print(r0)
            java.lang.String r0 = " mCommitted="
            r7.print(r0)
            boolean r0 = r5.mCommitted
            r7.println(r0)
            int r0 = r5.mTransition
            if (r0 == 0) goto L38
            r7.print(r6)
            java.lang.String r0 = "mTransition=#"
            r7.print(r0)
            int r0 = r5.mTransition
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
        L38:
            int r0 = r5.mEnterAnim
            if (r0 != 0) goto L40
            int r0 = r5.mExitAnim
            if (r0 == 0) goto L5f
        L40:
            r7.print(r6)
            java.lang.String r0 = "mEnterAnim=#"
            r7.print(r0)
            int r0 = r5.mEnterAnim
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mExitAnim=#"
            r7.print(r0)
            int r0 = r5.mExitAnim
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.println(r0)
        L5f:
            int r0 = r5.mPopEnterAnim
            if (r0 != 0) goto L67
            int r0 = r5.mPopExitAnim
            if (r0 == 0) goto L86
        L67:
            r7.print(r6)
            java.lang.String r0 = "mPopEnterAnim=#"
            r7.print(r0)
            int r0 = r5.mPopEnterAnim
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mPopExitAnim=#"
            r7.print(r0)
            int r0 = r5.mPopExitAnim
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.println(r0)
        L86:
            int r0 = r5.mBreadCrumbTitleRes
            if (r0 != 0) goto L8e
            java.lang.CharSequence r0 = r5.mBreadCrumbTitleText
            if (r0 == 0) goto La9
        L8e:
            r7.print(r6)
            java.lang.String r0 = "mBreadCrumbTitleRes=#"
            r7.print(r0)
            int r0 = r5.mBreadCrumbTitleRes
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mBreadCrumbTitleText="
            r7.print(r0)
            java.lang.CharSequence r0 = r5.mBreadCrumbTitleText
            r7.println(r0)
        La9:
            int r0 = r5.mBreadCrumbShortTitleRes
            if (r0 != 0) goto Lb1
            java.lang.CharSequence r0 = r5.mBreadCrumbShortTitleText
            if (r0 == 0) goto Lcc
        Lb1:
            r7.print(r6)
            java.lang.String r0 = "mBreadCrumbShortTitleRes=#"
            r7.print(r0)
            int r0 = r5.mBreadCrumbShortTitleRes
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mBreadCrumbShortTitleText="
            r7.print(r0)
            java.lang.CharSequence r0 = r5.mBreadCrumbShortTitleText
            r7.println(r0)
        Lcc:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r5.mOps
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L197
            r7.print(r6)
            java.lang.String r0 = "Operations:"
            r7.println(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r5.mOps
            int r0 = r0.size()
            r1 = 0
        Le3:
            if (r1 >= r0) goto L197
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r5.mOps
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.Op) r2
            int r3 = r2.mCmd
            switch(r3) {
                case 0: goto L124;
                case 1: goto L121;
                case 2: goto L11e;
                case 3: goto L11b;
                case 4: goto L118;
                case 5: goto L115;
                case 6: goto L112;
                case 7: goto L10f;
                case 8: goto L10c;
                case 9: goto L109;
                case 10: goto L106;
                default: goto Lf2;
            }
        Lf2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "cmd="
            r3.append(r4)
            int r4 = r2.mCmd
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L126
        L106:
            java.lang.String r3 = "OP_SET_MAX_LIFECYCLE"
            goto L126
        L109:
            java.lang.String r3 = "UNSET_PRIMARY_NAV"
            goto L126
        L10c:
            java.lang.String r3 = "SET_PRIMARY_NAV"
            goto L126
        L10f:
            java.lang.String r3 = "ATTACH"
            goto L126
        L112:
            java.lang.String r3 = "DETACH"
            goto L126
        L115:
            java.lang.String r3 = "SHOW"
            goto L126
        L118:
            java.lang.String r3 = "HIDE"
            goto L126
        L11b:
            java.lang.String r3 = "REMOVE"
            goto L126
        L11e:
            java.lang.String r3 = "REPLACE"
            goto L126
        L121:
            java.lang.String r3 = "ADD"
            goto L126
        L124:
            java.lang.String r3 = "NULL"
        L126:
            r7.print(r6)
            java.lang.String r4 = "  Op #"
            r7.print(r4)
            r7.print(r1)
            java.lang.String r4 = ": "
            r7.print(r4)
            r7.print(r3)
            java.lang.String r3 = " "
            r7.print(r3)
            androidx.fragment.app.Fragment r3 = r2.mFragment
            r7.println(r3)
            if (r8 == 0) goto L193
            int r3 = r2.mEnterAnim
            if (r3 != 0) goto L14d
            int r3 = r2.mExitAnim
            if (r3 == 0) goto L16c
        L14d:
            r7.print(r6)
            java.lang.String r3 = "enterAnim=#"
            r7.print(r3)
            int r3 = r2.mEnterAnim
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.print(r3)
            java.lang.String r3 = " exitAnim=#"
            r7.print(r3)
            int r3 = r2.mExitAnim
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.println(r3)
        L16c:
            int r3 = r2.mPopEnterAnim
            if (r3 != 0) goto L174
            int r3 = r2.mPopExitAnim
            if (r3 == 0) goto L193
        L174:
            r7.print(r6)
            java.lang.String r3 = "popEnterAnim=#"
            r7.print(r3)
            int r3 = r2.mPopEnterAnim
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.print(r3)
            java.lang.String r3 = " popExitAnim=#"
            r7.print(r3)
            int r2 = r2.mPopExitAnim
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r7.println(r2)
        L193:
            int r1 = r1 + 1
            goto Le3
        L197:
            return
    }

    void executeOps() {
            r8 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r8.mOps
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto Ld7
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r3 = r8.mOps
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.FragmentTransaction$Op r3 = (androidx.fragment.app.FragmentTransaction.Op) r3
            androidx.fragment.app.Fragment r4 = r3.mFragment
            if (r4 == 0) goto L29
            boolean r5 = r8.mBeingSaved
            r4.mBeingSaved = r5
            r4.setPopDirection(r1)
            int r5 = r8.mTransition
            r4.setNextTransition(r5)
            java.util.ArrayList<java.lang.String> r5 = r8.mSharedElementSourceNames
            java.util.ArrayList<java.lang.String> r6 = r8.mSharedElementTargetNames
            r4.setSharedElementNames(r5, r6)
        L29:
            int r5 = r3.mCmd
            switch(r5) {
                case 1: goto Lbe;
                case 2: goto L2e;
                case 3: goto Lad;
                case 4: goto L9c;
                case 5: goto L86;
                case 6: goto L75;
                case 7: goto L5f;
                case 8: goto L58;
                case 9: goto L50;
                case 10: goto L47;
                default: goto L2e;
            }
        L2e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown cmd: "
            r1.append(r2)
            int r2 = r3.mCmd
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L47:
            androidx.fragment.app.FragmentManager r5 = r8.mManager
            androidx.lifecycle.Lifecycle$State r3 = r3.mCurrentMaxState
            r5.setMaxLifecycle(r4, r3)
            goto Ld3
        L50:
            androidx.fragment.app.FragmentManager r3 = r8.mManager
            r4 = 0
            r3.setPrimaryNavigationFragment(r4)
            goto Ld3
        L58:
            androidx.fragment.app.FragmentManager r3 = r8.mManager
            r3.setPrimaryNavigationFragment(r4)
            goto Ld3
        L5f:
            int r5 = r3.mEnterAnim
            int r6 = r3.mExitAnim
            int r7 = r3.mPopEnterAnim
            int r3 = r3.mPopExitAnim
            r4.setAnimations(r5, r6, r7, r3)
            androidx.fragment.app.FragmentManager r3 = r8.mManager
            r3.setExitAnimationOrder(r4, r1)
            androidx.fragment.app.FragmentManager r3 = r8.mManager
            r3.attachFragment(r4)
            goto Ld3
        L75:
            int r5 = r3.mEnterAnim
            int r6 = r3.mExitAnim
            int r7 = r3.mPopEnterAnim
            int r3 = r3.mPopExitAnim
            r4.setAnimations(r5, r6, r7, r3)
            androidx.fragment.app.FragmentManager r3 = r8.mManager
            r3.detachFragment(r4)
            goto Ld3
        L86:
            int r5 = r3.mEnterAnim
            int r6 = r3.mExitAnim
            int r7 = r3.mPopEnterAnim
            int r3 = r3.mPopExitAnim
            r4.setAnimations(r5, r6, r7, r3)
            androidx.fragment.app.FragmentManager r3 = r8.mManager
            r3.setExitAnimationOrder(r4, r1)
            androidx.fragment.app.FragmentManager r3 = r8.mManager
            r3.showFragment(r4)
            goto Ld3
        L9c:
            int r5 = r3.mEnterAnim
            int r6 = r3.mExitAnim
            int r7 = r3.mPopEnterAnim
            int r3 = r3.mPopExitAnim
            r4.setAnimations(r5, r6, r7, r3)
            androidx.fragment.app.FragmentManager r3 = r8.mManager
            r3.hideFragment(r4)
            goto Ld3
        Lad:
            int r5 = r3.mEnterAnim
            int r6 = r3.mExitAnim
            int r7 = r3.mPopEnterAnim
            int r3 = r3.mPopExitAnim
            r4.setAnimations(r5, r6, r7, r3)
            androidx.fragment.app.FragmentManager r3 = r8.mManager
            r3.removeFragment(r4)
            goto Ld3
        Lbe:
            int r5 = r3.mEnterAnim
            int r6 = r3.mExitAnim
            int r7 = r3.mPopEnterAnim
            int r3 = r3.mPopExitAnim
            r4.setAnimations(r5, r6, r7, r3)
            androidx.fragment.app.FragmentManager r3 = r8.mManager
            r3.setExitAnimationOrder(r4, r1)
            androidx.fragment.app.FragmentManager r3 = r8.mManager
            r3.addFragment(r4)
        Ld3:
            int r2 = r2 + 1
            goto L8
        Ld7:
            return
    }

    void executePopOps() {
            r7 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r7.mOps
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto Ldb
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r7.mOps
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.Op) r2
            androidx.fragment.app.Fragment r3 = r2.mFragment
            if (r3 == 0) goto L2d
            boolean r4 = r7.mBeingSaved
            r3.mBeingSaved = r4
            r3.setPopDirection(r1)
            int r4 = r7.mTransition
            int r4 = androidx.fragment.app.FragmentManager.reverseTransit(r4)
            r3.setNextTransition(r4)
            java.util.ArrayList<java.lang.String> r4 = r7.mSharedElementTargetNames
            java.util.ArrayList<java.lang.String> r5 = r7.mSharedElementSourceNames
            r3.setSharedElementNames(r4, r5)
        L2d:
            int r4 = r2.mCmd
            switch(r4) {
                case 1: goto Lc2;
                case 2: goto L32;
                case 3: goto Lb1;
                case 4: goto La0;
                case 5: goto L8a;
                case 6: goto L79;
                case 7: goto L63;
                case 8: goto L5b;
                case 9: goto L54;
                case 10: goto L4b;
                default: goto L32;
            }
        L32:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Unknown cmd: "
            r1.append(r3)
            int r2 = r2.mCmd
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L4b:
            androidx.fragment.app.FragmentManager r4 = r7.mManager
            androidx.lifecycle.Lifecycle$State r2 = r2.mOldMaxState
            r4.setMaxLifecycle(r3, r2)
            goto Ld7
        L54:
            androidx.fragment.app.FragmentManager r2 = r7.mManager
            r2.setPrimaryNavigationFragment(r3)
            goto Ld7
        L5b:
            androidx.fragment.app.FragmentManager r2 = r7.mManager
            r3 = 0
            r2.setPrimaryNavigationFragment(r3)
            goto Ld7
        L63:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r2 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r2)
            androidx.fragment.app.FragmentManager r2 = r7.mManager
            r2.setExitAnimationOrder(r3, r1)
            androidx.fragment.app.FragmentManager r2 = r7.mManager
            r2.detachFragment(r3)
            goto Ld7
        L79:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r2 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r2)
            androidx.fragment.app.FragmentManager r2 = r7.mManager
            r2.attachFragment(r3)
            goto Ld7
        L8a:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r2 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r2)
            androidx.fragment.app.FragmentManager r2 = r7.mManager
            r2.setExitAnimationOrder(r3, r1)
            androidx.fragment.app.FragmentManager r2 = r7.mManager
            r2.hideFragment(r3)
            goto Ld7
        La0:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r2 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r2)
            androidx.fragment.app.FragmentManager r2 = r7.mManager
            r2.showFragment(r3)
            goto Ld7
        Lb1:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r2 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r2)
            androidx.fragment.app.FragmentManager r2 = r7.mManager
            r2.addFragment(r3)
            goto Ld7
        Lc2:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r2 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r2)
            androidx.fragment.app.FragmentManager r2 = r7.mManager
            r2.setExitAnimationOrder(r3, r1)
            androidx.fragment.app.FragmentManager r2 = r7.mManager
            r2.removeFragment(r3)
        Ld7:
            int r0 = r0 + (-1)
            goto L8
        Ldb:
            return
    }

    androidx.fragment.app.Fragment expandOps(java.util.ArrayList<androidx.fragment.app.Fragment> r17, androidx.fragment.app.Fragment r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r5 = r0.mOps
            int r5 = r5.size()
            if (r4 >= r5) goto Lbe
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r5 = r0.mOps
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.FragmentTransaction$Op r5 = (androidx.fragment.app.FragmentTransaction.Op) r5
            int r6 = r5.mCmd
            r7 = 0
            r8 = 1
            if (r6 == r8) goto Lb6
            r9 = 2
            r10 = 3
            r11 = 9
            if (r6 == r9) goto L5a
            if (r6 == r10) goto L43
            r9 = 6
            if (r6 == r9) goto L43
            r7 = 7
            if (r6 == r7) goto Lb6
            r7 = 8
            if (r6 == r7) goto L31
            goto Lbb
        L31:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r6 = r0.mOps
            androidx.fragment.app.FragmentTransaction$Op r7 = new androidx.fragment.app.FragmentTransaction$Op
            r7.<init>(r11, r3, r8)
            r6.add(r4, r7)
            r5.mFromExpandedOp = r8
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.mFragment
            goto Lbb
        L43:
            androidx.fragment.app.Fragment r6 = r5.mFragment
            r1.remove(r6)
            androidx.fragment.app.Fragment r5 = r5.mFragment
            if (r5 != r3) goto Lbb
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r3 = r0.mOps
            androidx.fragment.app.FragmentTransaction$Op r6 = new androidx.fragment.app.FragmentTransaction$Op
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r7
            goto Lbb
        L5a:
            androidx.fragment.app.Fragment r6 = r5.mFragment
            int r9 = r6.mContainerId
            int r12 = r17.size()
            int r12 = r12 - r8
            r13 = 0
        L64:
            if (r12 < 0) goto La4
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r15 = r14.mContainerId
            if (r15 != r9) goto La1
            if (r14 != r6) goto L74
            r13 = 1
            goto La1
        L74:
            if (r14 != r3) goto L83
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r3 = r0.mOps
            androidx.fragment.app.FragmentTransaction$Op r15 = new androidx.fragment.app.FragmentTransaction$Op
            r15.<init>(r11, r14, r8)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r7
        L83:
            androidx.fragment.app.FragmentTransaction$Op r15 = new androidx.fragment.app.FragmentTransaction$Op
            r15.<init>(r10, r14, r8)
            int r2 = r5.mEnterAnim
            r15.mEnterAnim = r2
            int r2 = r5.mPopEnterAnim
            r15.mPopEnterAnim = r2
            int r2 = r5.mExitAnim
            r15.mExitAnim = r2
            int r2 = r5.mPopExitAnim
            r15.mPopExitAnim = r2
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r0.mOps
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r8
        La1:
            int r12 = r12 + (-1)
            goto L64
        La4:
            if (r13 == 0) goto Lae
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r0.mOps
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lbb
        Lae:
            r5.mCmd = r8
            r5.mFromExpandedOp = r8
            r1.add(r6)
            goto Lbb
        Lb6:
            androidx.fragment.app.Fragment r2 = r5.mFragment
            r1.add(r2)
        Lbb:
            int r4 = r4 + r8
            goto L7
        Lbe:
            return r3
    }

    @Override // androidx.fragment.app.FragmentManager.OpGenerator
    public boolean generateOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3, java.util.ArrayList<java.lang.Boolean> r4) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Run: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1d:
            r3.add(r2)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4.add(r3)
            boolean r3 = r2.mAddToBackStack
            if (r3 == 0) goto L2e
            androidx.fragment.app.FragmentManager r3 = r2.mManager
            r3.addBackStackState(r2)
        L2e:
            r3 = 1
            return r3
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.mName
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public androidx.fragment.app.FragmentTransaction remove(androidx.fragment.app.Fragment r4) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 == 0) goto L29
            androidx.fragment.app.FragmentManager r1 = r3.mManager
            if (r0 != r1) goto L9
            goto L29
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot remove Fragment attached to a different FragmentManager. Fragment "
            r1.append(r2)
            java.lang.String r4 = r4.toString()
            r1.append(r4)
            java.lang.String r4 = " is already attached to a FragmentManager."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L29:
            androidx.fragment.app.FragmentTransaction r4 = super.remove(r4)
            return r4
    }

    public void runOnCommitRunnables() {
            r2 = this;
            java.util.ArrayList<java.lang.Runnable> r0 = r2.mCommitRunnables
            if (r0 == 0) goto L1e
            r0 = 0
        L5:
            java.util.ArrayList<java.lang.Runnable> r1 = r2.mCommitRunnables
            int r1 = r1.size()
            if (r0 >= r1) goto L1b
            java.util.ArrayList<java.lang.Runnable> r1 = r2.mCommitRunnables
            java.lang.Object r1 = r1.get(r0)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            int r0 = r0 + 1
            goto L5
        L1b:
            r0 = 0
            r2.mCommitRunnables = r0
        L1e:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            java.lang.String r1 = "BackStackEntry{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            int r1 = r2.mIndex
            if (r1 < 0) goto L25
            java.lang.String r1 = " #"
            r0.append(r1)
            int r1 = r2.mIndex
            r0.append(r1)
        L25:
            java.lang.String r1 = r2.mName
            if (r1 == 0) goto L33
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r2.mName
            r0.append(r1)
        L33:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    androidx.fragment.app.Fragment trackAddedFragmentsInPop(java.util.ArrayList<androidx.fragment.app.Fragment> r6, androidx.fragment.app.Fragment r7) {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r5.mOps
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r5.mOps
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.Op) r2
            int r3 = r2.mCmd
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.Lifecycle$State r3 = r2.mOldMaxState
            r2.mCurrentMaxState = r3
            goto L32
        L22:
            androidx.fragment.app.Fragment r7 = r2.mFragment
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.Fragment r2 = r2.mFragment
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.Fragment r2 = r2.mFragment
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
    }
}
