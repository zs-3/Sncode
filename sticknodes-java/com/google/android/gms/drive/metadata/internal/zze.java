package com.google.android.gms.drive.metadata.internal;

/* loaded from: classes.dex */
public class zze extends com.google.android.gms.drive.metadata.zzd<java.util.Date> {
    public zze(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ void zza(android.os.Bundle r4, java.lang.Object r5) {
            r3 = this;
            java.util.Date r5 = (java.util.Date) r5
            java.lang.String r0 = r3.getName()
            long r1 = r5.getTime()
            r4.putLong(r0, r1)
            return
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzb(android.os.Bundle r4) {
            r3 = this;
            java.util.Date r0 = new java.util.Date
            java.lang.String r1 = r3.getName()
            long r1 = r4.getLong(r1)
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzc(com.google.android.gms.common.data.DataHolder r3, int r4, int r5) {
            r2 = this;
            java.util.Date r0 = new java.util.Date
            java.lang.String r1 = r2.getName()
            long r3 = r3.getLong(r1, r4, r5)
            r0.<init>(r3)
            return r0
    }
}
