package androidx.fragment.app;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class BackStackRecordState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.BackStackRecordState> CREATOR = null;
    final int mBreadCrumbShortTitleRes;
    final java.lang.CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final java.lang.CharSequence mBreadCrumbTitleText;
    final int[] mCurrentMaxLifecycleStates;
    final java.util.ArrayList<java.lang.String> mFragmentWhos;
    final int mIndex;
    final java.lang.String mName;
    final int[] mOldMaxLifecycleStates;
    final int[] mOps;
    final boolean mReorderingAllowed;
    final java.util.ArrayList<java.lang.String> mSharedElementSourceNames;
    final java.util.ArrayList<java.lang.String> mSharedElementTargetNames;
    final int mTransition;


    static {
            androidx.fragment.app.BackStackRecordState$1 r0 = new androidx.fragment.app.BackStackRecordState$1
            r0.<init>()
            androidx.fragment.app.BackStackRecordState.CREATOR = r0
            return
    }

    BackStackRecordState(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int[] r0 = r2.createIntArray()
            r1.mOps = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.mFragmentWhos = r0
            int[] r0 = r2.createIntArray()
            r1.mOldMaxLifecycleStates = r0
            int[] r0 = r2.createIntArray()
            r1.mCurrentMaxLifecycleStates = r0
            int r0 = r2.readInt()
            r1.mTransition = r0
            java.lang.String r0 = r2.readString()
            r1.mName = r0
            int r0 = r2.readInt()
            r1.mIndex = r0
            int r0 = r2.readInt()
            r1.mBreadCrumbTitleRes = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r0 = r0.createFromParcel(r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.mBreadCrumbTitleText = r0
            int r0 = r2.readInt()
            r1.mBreadCrumbShortTitleRes = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r0 = r0.createFromParcel(r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.mBreadCrumbShortTitleText = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.mSharedElementSourceNames = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.mSharedElementTargetNames = r0
            int r2 = r2.readInt()
            if (r2 == 0) goto L61
            r2 = 1
            goto L62
        L61:
            r2 = 0
        L62:
            r1.mReorderingAllowed = r2
            return
    }

    BackStackRecordState(androidx.fragment.app.BackStackRecord r8) {
            r7 = this;
            r7.<init>()
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r8.mOps
            int r0 = r0.size()
            int r1 = r0 * 6
            int[] r1 = new int[r1]
            r7.mOps = r1
            boolean r1 = r8.mAddToBackStack
            if (r1 == 0) goto La4
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r7.mFragmentWhos = r1
            int[] r1 = new int[r0]
            r7.mOldMaxLifecycleStates = r1
            int[] r1 = new int[r0]
            r7.mCurrentMaxLifecycleStates = r1
            r1 = 0
            r2 = 0
        L24:
            if (r1 >= r0) goto L7b
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r3 = r8.mOps
            java.lang.Object r3 = r3.get(r1)
            androidx.fragment.app.FragmentTransaction$Op r3 = (androidx.fragment.app.FragmentTransaction.Op) r3
            int[] r4 = r7.mOps
            int r5 = r2 + 1
            int r6 = r3.mCmd
            r4[r2] = r6
            java.util.ArrayList<java.lang.String> r2 = r7.mFragmentWhos
            androidx.fragment.app.Fragment r4 = r3.mFragment
            if (r4 == 0) goto L3f
            java.lang.String r4 = r4.mWho
            goto L40
        L3f:
            r4 = 0
        L40:
            r2.add(r4)
            int[] r2 = r7.mOps
            int r4 = r5 + 1
            boolean r6 = r3.mFromExpandedOp
            r2[r5] = r6
            int r5 = r4 + 1
            int r6 = r3.mEnterAnim
            r2[r4] = r6
            int r4 = r5 + 1
            int r6 = r3.mExitAnim
            r2[r5] = r6
            int r5 = r4 + 1
            int r6 = r3.mPopEnterAnim
            r2[r4] = r6
            int r4 = r5 + 1
            int r6 = r3.mPopExitAnim
            r2[r5] = r6
            int[] r2 = r7.mOldMaxLifecycleStates
            androidx.lifecycle.Lifecycle$State r5 = r3.mOldMaxState
            int r5 = r5.ordinal()
            r2[r1] = r5
            int[] r2 = r7.mCurrentMaxLifecycleStates
            androidx.lifecycle.Lifecycle$State r3 = r3.mCurrentMaxState
            int r3 = r3.ordinal()
            r2[r1] = r3
            int r1 = r1 + 1
            r2 = r4
            goto L24
        L7b:
            int r0 = r8.mTransition
            r7.mTransition = r0
            java.lang.String r0 = r8.mName
            r7.mName = r0
            int r0 = r8.mIndex
            r7.mIndex = r0
            int r0 = r8.mBreadCrumbTitleRes
            r7.mBreadCrumbTitleRes = r0
            java.lang.CharSequence r0 = r8.mBreadCrumbTitleText
            r7.mBreadCrumbTitleText = r0
            int r0 = r8.mBreadCrumbShortTitleRes
            r7.mBreadCrumbShortTitleRes = r0
            java.lang.CharSequence r0 = r8.mBreadCrumbShortTitleText
            r7.mBreadCrumbShortTitleText = r0
            java.util.ArrayList<java.lang.String> r0 = r8.mSharedElementSourceNames
            r7.mSharedElementSourceNames = r0
            java.util.ArrayList<java.lang.String> r0 = r8.mSharedElementTargetNames
            r7.mSharedElementTargetNames = r0
            boolean r8 = r8.mReorderingAllowed
            r7.mReorderingAllowed = r8
            return
        La4:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Not on back stack"
            r8.<init>(r0)
            throw r8
    }

    private void fillInBackStackRecord(androidx.fragment.app.BackStackRecord r10) {
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            int[] r3 = r9.mOps
            int r3 = r3.length
            r4 = 1
            if (r1 >= r3) goto L93
            androidx.fragment.app.FragmentTransaction$Op r3 = new androidx.fragment.app.FragmentTransaction$Op
            r3.<init>()
            int[] r5 = r9.mOps
            int r6 = r1 + 1
            r1 = r5[r1]
            r3.mCmd = r1
            r1 = 2
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r1)
            if (r1 == 0) goto L47
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "Instantiate "
            r1.append(r5)
            r1.append(r10)
            java.lang.String r5 = " op #"
            r1.append(r5)
            r1.append(r2)
            java.lang.String r5 = " base fragment #"
            r1.append(r5)
            int[] r5 = r9.mOps
            r5 = r5[r6]
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "FragmentManager"
            android.util.Log.v(r5, r1)
        L47:
            androidx.lifecycle.Lifecycle$State[] r1 = androidx.lifecycle.Lifecycle.State.values()
            int[] r5 = r9.mOldMaxLifecycleStates
            r5 = r5[r2]
            r1 = r1[r5]
            r3.mOldMaxState = r1
            androidx.lifecycle.Lifecycle$State[] r1 = androidx.lifecycle.Lifecycle.State.values()
            int[] r5 = r9.mCurrentMaxLifecycleStates
            r5 = r5[r2]
            r1 = r1[r5]
            r3.mCurrentMaxState = r1
            int[] r1 = r9.mOps
            int r5 = r6 + 1
            r6 = r1[r6]
            if (r6 == 0) goto L68
            goto L69
        L68:
            r4 = 0
        L69:
            r3.mFromExpandedOp = r4
            int r4 = r5 + 1
            r5 = r1[r5]
            r3.mEnterAnim = r5
            int r6 = r4 + 1
            r4 = r1[r4]
            r3.mExitAnim = r4
            int r7 = r6 + 1
            r6 = r1[r6]
            r3.mPopEnterAnim = r6
            int r8 = r7 + 1
            r1 = r1[r7]
            r3.mPopExitAnim = r1
            r10.mEnterAnim = r5
            r10.mExitAnim = r4
            r10.mPopEnterAnim = r6
            r10.mPopExitAnim = r1
            r10.addOp(r3)
            int r2 = r2 + 1
            r1 = r8
            goto L3
        L93:
            int r0 = r9.mTransition
            r10.mTransition = r0
            java.lang.String r0 = r9.mName
            r10.mName = r0
            r10.mAddToBackStack = r4
            int r0 = r9.mBreadCrumbTitleRes
            r10.mBreadCrumbTitleRes = r0
            java.lang.CharSequence r0 = r9.mBreadCrumbTitleText
            r10.mBreadCrumbTitleText = r0
            int r0 = r9.mBreadCrumbShortTitleRes
            r10.mBreadCrumbShortTitleRes = r0
            java.lang.CharSequence r0 = r9.mBreadCrumbShortTitleText
            r10.mBreadCrumbShortTitleText = r0
            java.util.ArrayList<java.lang.String> r0 = r9.mSharedElementSourceNames
            r10.mSharedElementSourceNames = r0
            java.util.ArrayList<java.lang.String> r0 = r9.mSharedElementTargetNames
            r10.mSharedElementTargetNames = r0
            boolean r0 = r9.mReorderingAllowed
            r10.mReorderingAllowed = r0
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public androidx.fragment.app.BackStackRecord instantiate(androidx.fragment.app.FragmentManager r5) {
            r4 = this;
            androidx.fragment.app.BackStackRecord r0 = new androidx.fragment.app.BackStackRecord
            r0.<init>(r5)
            r4.fillInBackStackRecord(r0)
            int r1 = r4.mIndex
            r0.mIndex = r1
            r1 = 0
        Ld:
            java.util.ArrayList<java.lang.String> r2 = r4.mFragmentWhos
            int r2 = r2.size()
            if (r1 >= r2) goto L30
            java.util.ArrayList<java.lang.String> r2 = r4.mFragmentWhos
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L2d
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r3 = r0.mOps
            java.lang.Object r3 = r3.get(r1)
            androidx.fragment.app.FragmentTransaction$Op r3 = (androidx.fragment.app.FragmentTransaction.Op) r3
            androidx.fragment.app.Fragment r2 = r5.findActiveFragment(r2)
            r3.mFragment = r2
        L2d:
            int r1 = r1 + 1
            goto Ld
        L30:
            r5 = 1
            r0.bumpBackStackNesting(r5)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            int[] r3 = r1.mOps
            r2.writeIntArray(r3)
            java.util.ArrayList<java.lang.String> r3 = r1.mFragmentWhos
            r2.writeStringList(r3)
            int[] r3 = r1.mOldMaxLifecycleStates
            r2.writeIntArray(r3)
            int[] r3 = r1.mCurrentMaxLifecycleStates
            r2.writeIntArray(r3)
            int r3 = r1.mTransition
            r2.writeInt(r3)
            java.lang.String r3 = r1.mName
            r2.writeString(r3)
            int r3 = r1.mIndex
            r2.writeInt(r3)
            int r3 = r1.mBreadCrumbTitleRes
            r2.writeInt(r3)
            java.lang.CharSequence r3 = r1.mBreadCrumbTitleText
            r0 = 0
            android.text.TextUtils.writeToParcel(r3, r2, r0)
            int r3 = r1.mBreadCrumbShortTitleRes
            r2.writeInt(r3)
            java.lang.CharSequence r3 = r1.mBreadCrumbShortTitleText
            android.text.TextUtils.writeToParcel(r3, r2, r0)
            java.util.ArrayList<java.lang.String> r3 = r1.mSharedElementSourceNames
            r2.writeStringList(r3)
            java.util.ArrayList<java.lang.String> r3 = r1.mSharedElementTargetNames
            r2.writeStringList(r3)
            boolean r3 = r1.mReorderingAllowed
            r2.writeInt(r3)
            return
    }
}
