package com.google.android.gms.drive.metadata.internal;

/* loaded from: classes.dex */
public class zzi extends com.google.android.gms.drive.metadata.zza<java.lang.Long> {
    public zzi(java.lang.String r1, int r2) {
            r0 = this;
            r2 = 4300000(0x419ce0, float:6.025583E-39)
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ void zza(android.os.Bundle r4, java.lang.Long r5) {
            r3 = this;
            java.lang.Long r5 = (java.lang.Long) r5
            java.lang.String r0 = r3.getName()
            long r1 = r5.longValue()
            r4.putLong(r0, r1)
            return
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Long zzb(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = r2.getName()
            long r0 = r3.getLong(r0)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Long zzc(com.google.android.gms.common.data.DataHolder r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = r1.getName()
            long r2 = r2.getLong(r0, r3, r4)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            return r2
    }
}
