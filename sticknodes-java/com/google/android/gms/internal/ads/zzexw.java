package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzexw implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.internal.ads.zzgfz zza;
    private final android.content.Context zzb;

    public zzexw(com.google.android.gms.internal.ads.zzgfz r1, android.content.Context r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 39
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzexv r0 = new com.google.android.gms.internal.ads.zzexv
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r1 = r2.zza
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r0)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzexu zzc() throws java.lang.Exception {
            r10 = this;
            android.content.Context r0 = r10.zzb
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r2 = r0.getNetworkOperator()
            int r5 = r0.getPhoneType()
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r0 = r10.zzb
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzA(r0, r1)
            r1 = -1
            if (r0 == 0) goto L48
            android.content.Context r0 = r10.zzb
            java.lang.String r3 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r3 = r0.getActiveNetworkInfo()
            if (r3 == 0) goto L40
            int r1 = r3.getType()
            android.net.NetworkInfo$DetailedState r3 = r3.getDetailedState()
            int r3 = r3.ordinal()
            r9 = r3
            r3 = r1
            r1 = r9
            goto L41
        L40:
            r3 = -1
        L41:
            boolean r0 = r0.isActiveNetworkMetered()
            r6 = r0
            r7 = r1
            goto L4c
        L48:
            r0 = 0
            r3 = -2
            r6 = 0
            r7 = -1
        L4c:
            android.content.Context r0 = r10.zzb
            com.google.android.gms.internal.ads.zzexu r8 = new com.google.android.gms.internal.ads.zzexu
            com.google.android.gms.ads.internal.util.zzab r1 = com.google.android.gms.ads.internal.zzu.zzq()
            int r4 = r1.zzm(r0)
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r8
    }
}
