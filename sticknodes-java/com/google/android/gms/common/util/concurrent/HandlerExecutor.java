package com.google.android.gms.common.util.concurrent;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public class HandlerExecutor implements java.util.concurrent.Executor {
    private final android.os.Handler zza;

    @com.google.android.gms.common.annotation.KeepForSdk
    public HandlerExecutor(android.os.Looper r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.common.zzh r0 = new com.google.android.gms.internal.common.zzh
            r0.<init>(r2)
            r1.zza = r0
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            android.os.Handler r0 = r1.zza
            r0.post(r2)
            return
    }
}
