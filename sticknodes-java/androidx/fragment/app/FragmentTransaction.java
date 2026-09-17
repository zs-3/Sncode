package androidx.fragment.app;

/* loaded from: classes.dex */
public abstract class FragmentTransaction {
    boolean mAddToBackStack;
    boolean mAllowAddToBackStack;
    int mBreadCrumbShortTitleRes;
    java.lang.CharSequence mBreadCrumbShortTitleText;
    int mBreadCrumbTitleRes;
    java.lang.CharSequence mBreadCrumbTitleText;
    private final java.lang.ClassLoader mClassLoader;
    java.util.ArrayList<java.lang.Runnable> mCommitRunnables;
    int mEnterAnim;
    int mExitAnim;
    private final androidx.fragment.app.FragmentFactory mFragmentFactory;
    java.lang.String mName;
    java.util.ArrayList<androidx.fragment.app.FragmentTransaction.Op> mOps;
    int mPopEnterAnim;
    int mPopExitAnim;
    boolean mReorderingAllowed;
    java.util.ArrayList<java.lang.String> mSharedElementSourceNames;
    java.util.ArrayList<java.lang.String> mSharedElementTargetNames;
    int mTransition;

    static final class Op {
        int mCmd;
        androidx.lifecycle.Lifecycle.State mCurrentMaxState;
        int mEnterAnim;
        int mExitAnim;
        androidx.fragment.app.Fragment mFragment;
        boolean mFromExpandedOp;
        androidx.lifecycle.Lifecycle.State mOldMaxState;
        int mPopEnterAnim;
        int mPopExitAnim;

        Op() {
                r0 = this;
                r0.<init>()
                return
        }

        Op(int r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                r0.<init>()
                r0.mCmd = r1
                r0.mFragment = r2
                r1 = 0
                r0.mFromExpandedOp = r1
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED
                r0.mOldMaxState = r1
                r0.mCurrentMaxState = r1
                return
        }

        Op(int r1, androidx.fragment.app.Fragment r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.mCmd = r1
                r0.mFragment = r2
                r0.mFromExpandedOp = r3
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED
                r0.mOldMaxState = r1
                r0.mCurrentMaxState = r1
                return
        }
    }

    FragmentTransaction(androidx.fragment.app.FragmentFactory r2, java.lang.ClassLoader r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mOps = r0
            r0 = 1
            r1.mAllowAddToBackStack = r0
            r0 = 0
            r1.mReorderingAllowed = r0
            r1.mFragmentFactory = r2
            r1.mClassLoader = r3
            return
    }

    public androidx.fragment.app.FragmentTransaction add(int r2, androidx.fragment.app.Fragment r3, java.lang.String r4) {
            r1 = this;
            r0 = 1
            r1.doAddOp(r2, r3, r4, r0)
            return r1
    }

    androidx.fragment.app.FragmentTransaction add(android.view.ViewGroup r1, androidx.fragment.app.Fragment r2, java.lang.String r3) {
            r0 = this;
            r2.mContainer = r1
            int r1 = r1.getId()
            androidx.fragment.app.FragmentTransaction r1 = r0.add(r1, r2, r3)
            return r1
    }

    public androidx.fragment.app.FragmentTransaction add(androidx.fragment.app.Fragment r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.doAddOp(r0, r3, r4, r1)
            return r2
    }

    void addOp(androidx.fragment.app.FragmentTransaction.Op r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r1.mOps
            r0.add(r2)
            int r0 = r1.mEnterAnim
            r2.mEnterAnim = r0
            int r0 = r1.mExitAnim
            r2.mExitAnim = r0
            int r0 = r1.mPopEnterAnim
            r2.mPopEnterAnim = r0
            int r0 = r1.mPopExitAnim
            r2.mPopExitAnim = r0
            return
    }

    public abstract int commit();

    public abstract int commitAllowingStateLoss();

    public abstract void commitNow();

    public abstract void commitNowAllowingStateLoss();

    public androidx.fragment.app.FragmentTransaction disallowAddToBackStack() {
            r2 = this;
            boolean r0 = r2.mAddToBackStack
            if (r0 != 0) goto L8
            r0 = 0
            r2.mAllowAddToBackStack = r0
            return r2
        L8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This transaction is already being added to the back stack"
            r0.<init>(r1)
            throw r0
    }

    void doAddOp(int r4, androidx.fragment.app.Fragment r5, java.lang.String r6, int r7) {
            r3 = this;
            java.lang.String r0 = r5.mPreviousWho
            if (r0 == 0) goto L7
            androidx.fragment.app.strictmode.FragmentStrictMode.onFragmentReuse(r5, r0)
        L7:
            java.lang.Class r0 = r5.getClass()
            int r1 = r0.getModifiers()
            boolean r2 = r0.isAnonymousClass()
            if (r2 != 0) goto Lc2
            boolean r2 = java.lang.reflect.Modifier.isPublic(r1)
            if (r2 == 0) goto Lc2
            boolean r2 = r0.isMemberClass()
            if (r2 == 0) goto L27
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 == 0) goto Lc2
        L27:
            java.lang.String r0 = " now "
            java.lang.String r1 = ": was "
            if (r6 == 0) goto L5f
            java.lang.String r2 = r5.mTag
            if (r2 == 0) goto L5d
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L38
            goto L5d
        L38:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "Can't change tag of fragment "
            r7.append(r2)
            r7.append(r5)
            r7.append(r1)
            java.lang.String r5 = r5.mTag
            r7.append(r5)
            r7.append(r0)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
            r4.<init>(r5)
            throw r4
        L5d:
            r5.mTag = r6
        L5f:
            if (r4 == 0) goto Lb9
            r2 = -1
            if (r4 == r2) goto L95
            int r6 = r5.mFragmentId
            if (r6 == 0) goto L90
            if (r6 != r4) goto L6b
            goto L90
        L6b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "Can't change container ID of fragment "
            r7.append(r2)
            r7.append(r5)
            r7.append(r1)
            int r5 = r5.mFragmentId
            r7.append(r5)
            r7.append(r0)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r6.<init>(r4)
            throw r6
        L90:
            r5.mFragmentId = r4
            r5.mContainerId = r4
            goto Lb9
        L95:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Can't add fragment "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = " with tag "
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = " to container view with no id"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r4.<init>(r5)
            throw r4
        Lb9:
            androidx.fragment.app.FragmentTransaction$Op r4 = new androidx.fragment.app.FragmentTransaction$Op
            r4.<init>(r7, r5)
            r3.addOp(r4)
            return
        Lc2:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Fragment "
            r5.append(r6)
            java.lang.String r6 = r0.getCanonicalName()
            r5.append(r6)
            java.lang.String r6 = " must be a public static class to be  properly recreated from instance state."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public androidx.fragment.app.FragmentTransaction remove(androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r1 = 3
            r0.<init>(r1, r3)
            r2.addOp(r0)
            return r2
    }

    public androidx.fragment.app.FragmentTransaction setReorderingAllowed(boolean r1) {
            r0 = this;
            r0.mReorderingAllowed = r1
            return r0
    }
}
