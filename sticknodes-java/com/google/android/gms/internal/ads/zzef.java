package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzef extends android.telephony.TelephonyCallback implements android.telephony.TelephonyCallback.DisplayInfoListener {
    private final com.google.android.gms.internal.ads.zzei zza;

    public zzef(com.google.android.gms.internal.ads.zzei r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo r4) {
            r3 = this;
            int r4 = r4.getOverrideNetworkType()
            r0 = 5
            r1 = 1
            r2 = 3
            if (r4 == r2) goto L11
            r2 = 4
            if (r4 == r2) goto L11
            if (r4 != r0) goto Lf
            goto L11
        Lf:
            r4 = 0
            goto L12
        L11:
            r4 = 1
        L12:
            com.google.android.gms.internal.ads.zzei r2 = r3.zza
            if (r1 == r4) goto L17
            goto L19
        L17:
            r0 = 10
        L19:
            com.google.android.gms.internal.ads.zzei.zzc(r2, r0)
            return
    }
}
