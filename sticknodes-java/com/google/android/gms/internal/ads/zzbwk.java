package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbwk extends android.content.ContextWrapper {
    public static android.content.Context zza(android.content.Context r1) {
            boolean r0 = r1 instanceof com.google.android.gms.internal.ads.zzbwk
            if (r0 != 0) goto Lc
            android.content.Context r0 = r1.getApplicationContext()
            if (r0 != 0) goto Lb
            return r1
        Lb:
            return r0
        Lc:
            com.google.android.gms.internal.ads.zzbwk r1 = (com.google.android.gms.internal.ads.zzbwk) r1
            android.content.Context r1 = r1.getBaseContext()
            return r1
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.Context getApplicationContext() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized android.content.pm.ApplicationInfo getApplicationInfo() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L3
        L3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized java.lang.String getPackageName() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L3
        L3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized java.lang.String getPackageResourcePath() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L3
        L3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized void startActivity(android.content.Intent r1) {
            r0 = this;
            monitor-enter(r0)
            r1 = 0
            throw r1     // Catch: java.lang.Throwable -> L3
        L3:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
