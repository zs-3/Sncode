package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
abstract class zza extends com.google.android.gms.common.internal.zzc {
    public final int zza;
    public final android.os.Bundle zzb;
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzc;

    protected zza(com.google.android.gms.common.internal.BaseGmsClient r2, int r3, android.os.Bundle r4) {
            r1 = this;
            r1.zzc = r2
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.<init>(r2, r0)
            r1.zza = r3
            r1.zzb = r4
            return
    }

    @Override // com.google.android.gms.common.internal.zzc
    protected final /* bridge */ /* synthetic */ void zza(java.lang.Object r3) {
            r2 = this;
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            int r3 = r2.zza
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L1e
            boolean r3 = r2.zzd()
            if (r3 != 0) goto L1d
            com.google.android.gms.common.internal.BaseGmsClient r3 = r2.zzc
            com.google.android.gms.common.internal.BaseGmsClient.zzi(r3, r0, r1)
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r0 = 8
            r3.<init>(r0, r1)
            r2.zzb(r3)
        L1d:
            return
        L1e:
            com.google.android.gms.common.internal.BaseGmsClient r3 = r2.zzc
            com.google.android.gms.common.internal.BaseGmsClient.zzi(r3, r0, r1)
            android.os.Bundle r3 = r2.zzb
            if (r3 == 0) goto L30
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L30:
            int r3 = r2.zza
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r0.<init>(r3, r1)
            r2.zzb(r0)
            return
    }

    protected abstract void zzb(com.google.android.gms.common.ConnectionResult r1);

    @Override // com.google.android.gms.common.internal.zzc
    protected final void zzc() {
            r0 = this;
            return
    }

    protected abstract boolean zzd();
}
