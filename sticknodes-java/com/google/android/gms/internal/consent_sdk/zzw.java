package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
final class zzw {
    private final com.google.android.gms.internal.consent_sdk.zzx zza;
    private final com.google.android.gms.internal.consent_sdk.zzck zzb;
    private int zzc;
    private com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus zzd;

    zzw(com.google.android.gms.internal.consent_sdk.zzx r2, com.google.android.gms.internal.consent_sdk.zzck r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzc = r0
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r0 = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN
            r1.zzd = r0
            r1.zza = r2
            r1.zzb = r3
            return
    }

    final com.google.android.gms.internal.consent_sdk.zzz zza() throws com.google.android.gms.internal.consent_sdk.zzg {
            r11 = this;
            com.google.android.gms.internal.consent_sdk.zzck r0 = r11.zzb
            int r0 = r0.zzf
            r1 = 0
            r2 = 1
            r3 = 8
            if (r0 != r3) goto Lc
            r3 = 1
            goto Ld
        Lc:
            r3 = 0
        Ld:
            com.google.android.gms.internal.consent_sdk.zzx r4 = r11.zza
            com.google.android.gms.internal.consent_sdk.zzap r4 = com.google.android.gms.internal.consent_sdk.zzx.zzc(r4)
            r4.zzh(r3)
            int r3 = r0 + (-1)
            r4 = 0
            if (r0 == 0) goto Lda
            java.lang.String r0 = "Invalid response from server."
            r5 = 3
            r6 = 2
            switch(r3) {
                case 1: goto L56;
                case 2: goto L56;
                case 3: goto L56;
                case 4: goto L53;
                case 5: goto L50;
                case 6: goto L3c;
                case 7: goto L28;
                default: goto L22;
            }
        L22:
            com.google.android.gms.internal.consent_sdk.zzg r1 = new com.google.android.gms.internal.consent_sdk.zzg
            r1.<init>(r2, r0)
            throw r1
        L28:
            com.google.android.gms.internal.consent_sdk.zzck r0 = r11.zzb
            com.google.android.gms.internal.consent_sdk.zzg r1 = new com.google.android.gms.internal.consent_sdk.zzg
            java.lang.String r0 = r0.zzc
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Publisher misconfiguration: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r5, r0)
            throw r1
        L3c:
            com.google.android.gms.internal.consent_sdk.zzck r0 = r11.zzb
            com.google.android.gms.internal.consent_sdk.zzg r1 = new com.google.android.gms.internal.consent_sdk.zzg
            java.lang.String r0 = r0.zzc
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "Invalid response from server: "
            java.lang.String r0 = r3.concat(r0)
            r1.<init>(r2, r0)
            throw r1
        L50:
            r11.zzc = r2
            goto L58
        L53:
            r11.zzc = r6
            goto L58
        L56:
            r11.zzc = r5
        L58:
            com.google.android.gms.internal.consent_sdk.zzck r3 = r11.zzb
            int r5 = r3.zzg
            int r7 = r5 + (-1)
            if (r5 == 0) goto Ld9
            if (r7 == r2) goto L6f
            if (r7 != r6) goto L69
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r0 = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED
            r11.zzd = r0
            goto L73
        L69:
            com.google.android.gms.internal.consent_sdk.zzg r1 = new com.google.android.gms.internal.consent_sdk.zzg
            r1.<init>(r2, r0)
            throw r1
        L6f:
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r0 = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED
            r11.zzd = r0
        L73:
            java.lang.String r0 = r3.zza
            if (r0 != 0) goto L79
            r5 = r4
            goto L80
        L79:
            com.google.android.gms.internal.consent_sdk.zzbp r5 = new com.google.android.gms.internal.consent_sdk.zzbp
            java.lang.String r7 = r3.zzb
            r5.<init>(r7, r0)
        L80:
            com.google.android.gms.internal.consent_sdk.zzx r0 = r11.zza
            com.google.android.gms.internal.consent_sdk.zzap r0 = com.google.android.gms.internal.consent_sdk.zzx.zzc(r0)
            java.util.HashSet r7 = new java.util.HashSet
            java.util.List r3 = r3.zzd
            r7.<init>(r3)
            r0.zzj(r7)
            com.google.android.gms.internal.consent_sdk.zzck r0 = r11.zzb
            java.util.List r0 = r0.zze
            java.util.Iterator r0 = r0.iterator()
        L98:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lcf
            java.lang.Object r3 = r0.next()
            com.google.android.gms.internal.consent_sdk.zzcj r3 = (com.google.android.gms.internal.consent_sdk.zzcj) r3
            int r7 = r3.zzb
            int r8 = r7 + (-1)
            if (r7 == 0) goto Lce
            if (r8 == 0) goto Lb7
            if (r8 == r2) goto Lb4
            if (r8 == r6) goto Lb1
            goto Lb7
        Lb1:
            java.lang.String r7 = "clear"
            goto Lb8
        Lb4:
            java.lang.String r7 = "write"
            goto Lb8
        Lb7:
            r7 = r4
        Lb8:
            if (r7 == 0) goto L98
            com.google.android.gms.internal.consent_sdk.zzx r8 = r11.zza
            com.google.android.gms.internal.consent_sdk.zze r9 = com.google.android.gms.internal.consent_sdk.zzx.zza(r8)
            java.lang.String r3 = r3.zza
            com.google.android.gms.internal.consent_sdk.zzd[] r10 = new com.google.android.gms.internal.consent_sdk.zzd[r2]
            com.google.android.gms.internal.consent_sdk.zzan r8 = com.google.android.gms.internal.consent_sdk.zzx.zzb(r8)
            r10[r1] = r8
            r9.zzb(r7, r3, r10)
            goto L98
        Lce:
            throw r4
        Lcf:
            com.google.android.gms.internal.consent_sdk.zzz r0 = new com.google.android.gms.internal.consent_sdk.zzz
            int r1 = r11.zzc
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r2 = r11.zzd
            r0.<init>(r1, r2, r5, r4)
            return r0
        Ld9:
            throw r4
        Lda:
            throw r4
    }
}
