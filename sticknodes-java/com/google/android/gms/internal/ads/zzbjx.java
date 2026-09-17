package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbjx implements com.google.android.gms.internal.ads.zzbjw {
    private final com.google.android.gms.internal.ads.zzdxb zza;

    public zzbjx(com.google.android.gms.internal.ads.zzdxb r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "The Inspector Manager must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            r1.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zza(java.lang.Object r2, java.util.Map r3) {
            r1 = this;
            if (r3 == 0) goto L22
            java.lang.String r2 = "persistentData"
            boolean r0 = r3.containsKey(r2)
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.get(r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L17
            goto L22
        L17:
            com.google.android.gms.internal.ads.zzdxb r0 = r1.zza
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r0.zzj(r2)
        L22:
            return
    }
}
