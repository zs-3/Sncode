package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzhx {
    private final com.google.android.gms.measurement.internal.zzhx.zza zza;

    /* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
    public interface zza {
        void doStartService(android.content.Context r1, android.content.Intent r2);
    }

    public zzhx(com.google.android.gms.measurement.internal.zzhx.zza r1) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            r0.zza = r1
            return
    }

    public final void zza(android.content.Context r4, android.content.Intent r5) {
            r3 = this;
            r0 = 0
            com.google.android.gms.measurement.internal.zzio r0 = com.google.android.gms.measurement.internal.zzio.zzp(r4, r0, r0)
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            if (r5 != 0) goto L15
            com.google.android.gms.measurement.internal.zzhc r4 = r1.zzk()
            java.lang.String r5 = "Receiver called with null intent"
            r4.zza(r5)
            return
        L15:
            r0.zzaV()
            java.lang.String r5 = r5.getAction()
            com.google.android.gms.measurement.internal.zzhc r0 = r1.zzj()
            java.lang.String r2 = "Local receiver got"
            r0.zzb(r2, r5)
            java.lang.String r0 = "com.google.android.gms.measurement.UPLOAD"
            boolean r2 = r0.equals(r5)
            if (r2 == 0) goto L4a
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r2 = "com.google.android.gms.measurement.AppMeasurementService"
            android.content.Intent r5 = r5.setClassName(r4, r2)
            r5.setAction(r0)
            com.google.android.gms.measurement.internal.zzhc r0 = r1.zzj()
            java.lang.String r1 = "Starting wakeful intent."
            r0.zza(r1)
            com.google.android.gms.measurement.internal.zzhx$zza r0 = r3.zza
            r0.doStartService(r4, r5)
            return
        L4a:
            java.lang.String r4 = "com.android.vending.INSTALL_REFERRER"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L5b
            com.google.android.gms.measurement.internal.zzhc r4 = r1.zzk()
            java.lang.String r5 = "Install Referrer Broadcasts are deprecated"
            r4.zza(r5)
        L5b:
            return
    }
}
