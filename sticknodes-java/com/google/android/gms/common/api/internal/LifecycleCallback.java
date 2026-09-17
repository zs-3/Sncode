package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public class LifecycleCallback {

    @com.google.android.gms.common.annotation.KeepForSdk
    protected final com.google.android.gms.common.api.internal.LifecycleFragment mLifecycleFragment;

    @com.google.android.gms.common.annotation.KeepForSdk
    protected LifecycleCallback(com.google.android.gms.common.api.internal.LifecycleFragment r1) {
            r0 = this;
            r0.<init>()
            r0.mLifecycleFragment = r1
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.api.internal.LifecycleFragment getFragment(android.app.Activity r1) {
            com.google.android.gms.common.api.internal.LifecycleActivity r0 = new com.google.android.gms.common.api.internal.LifecycleActivity
            r0.<init>(r1)
            com.google.android.gms.common.api.internal.LifecycleFragment r1 = getFragment(r0)
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.api.internal.LifecycleFragment getFragment(android.content.ContextWrapper r0) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected static com.google.android.gms.common.api.internal.LifecycleFragment getFragment(com.google.android.gms.common.api.internal.LifecycleActivity r1) {
            boolean r0 = r1.zzd()
            if (r0 == 0) goto Lf
            androidx.fragment.app.FragmentActivity r1 = r1.zzb()
            com.google.android.gms.common.api.internal.zzd r1 = com.google.android.gms.common.api.internal.zzd.zza(r1)
            return r1
        Lf:
            boolean r0 = r1.zzc()
            if (r0 == 0) goto L1e
            android.app.Activity r1 = r1.zza()
            com.google.android.gms.common.api.internal.zza r1 = com.google.android.gms.common.api.internal.zza.zza(r1)
            return r1
        L1e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Can't get fragment for unexpected activity."
            r1.<init>(r0)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void dump(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4) {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public android.app.Activity getActivity() {
            r1 = this;
            com.google.android.gms.common.api.internal.LifecycleFragment r0 = r1.mLifecycleFragment
            android.app.Activity r0 = r0.getLifecycleActivity()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void onActivityResult(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void onCreate(android.os.Bundle r1) {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void onDestroy() {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void onResume() {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void onSaveInstanceState(android.os.Bundle r1) {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void onStart() {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void onStop() {
            r0 = this;
            return
    }
}
