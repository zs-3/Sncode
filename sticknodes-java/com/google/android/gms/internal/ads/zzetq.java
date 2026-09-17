package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzetq implements com.google.android.gms.internal.ads.zzexh {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzgfz zzb;

    zzetq(android.content.Context r1, com.google.android.gms.internal.ads.zzgfz r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 18
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzetn r0 = new com.google.android.gms.internal.ads.zzetn
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r1 = r2.zzb
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r0)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzetp zzc() throws java.lang.Exception {
            r11 = this;
            com.google.android.gms.internal.ads.zzetp r0 = new com.google.android.gms.internal.ads.zzetp
            com.google.android.gms.ads.internal.zzu.zzp()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzfQ
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r2 = "mobileads_consent"
            java.lang.String r3 = ""
            r4 = 0
            if (r1 != 0) goto L1e
            r1 = r3
            goto L2a
        L1e:
            android.content.Context r1 = r11.zza
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r4)
            java.lang.String r5 = "consent_string"
            java.lang.String r1 = r1.getString(r5, r3)
        L2a:
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzfS
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r6.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L3d
            goto L49
        L3d:
            android.content.Context r5 = r11.zza
            android.content.SharedPreferences r2 = r5.getSharedPreferences(r2, r4)
            java.lang.String r5 = "fc_consent"
            java.lang.String r3 = r2.getString(r5, r3)
        L49:
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r2 = r11.zza
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzfR
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r6.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r6 = 0
            if (r5 != 0) goto L63
            r5 = r6
            goto L9c
        L63:
            android.content.SharedPreferences r2 = android.preference.PreferenceManager.getDefaultSharedPreferences(r2)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r7 = "IABConsent_CMPPresent"
            boolean r8 = r2.contains(r7)
            if (r8 == 0) goto L7b
            boolean r8 = r2.getBoolean(r7, r4)
            r5.putBoolean(r7, r8)
        L7b:
            java.lang.String r7 = "IABConsent_SubjectToGDPR"
            java.lang.String r8 = "IABConsent_ConsentString"
            java.lang.String r9 = "IABConsent_ParsedPurposeConsents"
            java.lang.String r10 = "IABConsent_ParsedVendorConsents"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8, r9, r10}
        L87:
            r8 = 4
            if (r4 >= r8) goto L9c
            r8 = r7[r4]
            boolean r9 = r2.contains(r8)
            if (r9 == 0) goto L99
            java.lang.String r9 = r2.getString(r8, r6)
            r5.putString(r8, r9)
        L99:
            int r4 = r4 + 1
            goto L87
        L9c:
            r0.<init>(r1, r3, r5, r6)
            return r0
    }
}
