package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
enum zzgfc extends java.lang.Enum implements java.util.concurrent.Executor {
    public static final com.google.android.gms.internal.ads.zzgfc zza = null;
    private static final /* synthetic */ com.google.android.gms.internal.ads.zzgfc[] zzb = null;

    static {
            com.google.android.gms.internal.ads.zzgfc r0 = new com.google.android.gms.internal.ads.zzgfc
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.gms.internal.ads.zzgfc.zza = r0
            r1 = 1
            com.google.android.gms.internal.ads.zzgfc[] r1 = new com.google.android.gms.internal.ads.zzgfc[r1]
            r1[r2] = r0
            com.google.android.gms.internal.ads.zzgfc.zzb = r1
            return
    }

    zzgfc(java.lang.String r1, int r2) {
            r0 = this;
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    public static com.google.android.gms.internal.ads.zzgfc[] values() {
            com.google.android.gms.internal.ads.zzgfc[] r0 = com.google.android.gms.internal.ads.zzgfc.zzb
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.ads.zzgfc[] r0 = (com.google.android.gms.internal.ads.zzgfc[]) r0
            return r0
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r1) {
            r0 = this;
            r1.run()
            return
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "MoreExecutors.directExecutor()"
            return r0
    }
}
