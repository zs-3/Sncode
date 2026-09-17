package com.google.android.gms.internal.ads_identifier;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes.dex */
public abstract class zze extends com.google.android.gms.internal.ads_identifier.zzb implements com.google.android.gms.internal.ads_identifier.zzf {
    public static com.google.android.gms.internal.ads_identifier.zzf zza(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads_identifier.zzf
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads_identifier.zzf r0 = (com.google.android.gms.internal.ads_identifier.zzf) r0
            return r0
        L11:
            com.google.android.gms.internal.ads_identifier.zzd r0 = new com.google.android.gms.internal.ads_identifier.zzd
            r0.<init>(r2)
            return r0
    }
}
