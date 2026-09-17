package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzc extends com.google.android.gms.ads.internal.util.zzb {
    private final android.content.Context zza;

    zzc(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
            r3 = this;
            android.content.Context r0 = r3.zza     // Catch: com.google.android.gms.common.GooglePlayServicesRepairableException -> L7 com.google.android.gms.common.GooglePlayServicesNotAvailableException -> L9 java.lang.IllegalStateException -> Lb java.io.IOException -> Ld
            boolean r0 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getIsAdIdFakeForDebugLogging(r0)     // Catch: com.google.android.gms.common.GooglePlayServicesRepairableException -> L7 com.google.android.gms.common.GooglePlayServicesNotAvailableException -> L9 java.lang.IllegalStateException -> Lb java.io.IOException -> Ld
            goto L14
        L7:
            r0 = move-exception
            goto Le
        L9:
            r0 = move-exception
            goto Le
        Lb:
            r0 = move-exception
            goto Le
        Ld:
            r0 = move-exception
        Le:
            java.lang.String r1 = "Fail to get isAdIdFakeForDebugLogging"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
        L14:
            com.google.android.gms.ads.internal.util.client.zzl.zzj(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Update ad debug logging enablement as "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            return
    }
}
