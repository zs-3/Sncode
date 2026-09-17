package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public abstract class zzbq extends com.google.android.gms.internal.measurement.zzbn implements com.google.android.gms.internal.measurement.zzbr {
    public static com.google.android.gms.internal.measurement.zzbr zzb(android.os.IBinder r2) {
            java.lang.String r0 = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzbr
            if (r1 == 0) goto Ld
            com.google.android.gms.internal.measurement.zzbr r0 = (com.google.android.gms.internal.measurement.zzbr) r0
            return r0
        Ld:
            com.google.android.gms.internal.measurement.zzbp r0 = new com.google.android.gms.internal.measurement.zzbp
            r0.<init>(r2)
            return r0
    }
}
