package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public final class zzap {
    static final com.google.android.gms.internal.consent_sdk.zzde zza = null;
    private final android.app.Application zzb;
    private final android.content.SharedPreferences zzc;
    private final java.util.Set zzd;

    static {
            java.lang.String r0 = "IABTCF_TCString"
            java.lang.String r1 = "IABGPP_HDR_GppString"
            java.lang.String r2 = "IABGPP_GppSID"
            java.lang.String r3 = "IABUSPrivacy_String"
            com.google.android.gms.internal.consent_sdk.zzde r0 = com.google.android.gms.internal.consent_sdk.zzde.zzj(r0, r1, r2, r3)
            com.google.android.gms.internal.consent_sdk.zzap.zza = r0
            return
    }

    zzap(android.app.Application r4) {
            r3 = this;
            r3.<init>()
            r3.zzb = r4
            java.lang.String r0 = "__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__"
            r1 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r0, r1)
            r3.zzc = r4
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Set r1 = java.util.Collections.emptySet()
            java.lang.String r2 = "written_values"
            java.util.Set r4 = r4.getStringSet(r2, r1)
            r0.<init>(r4)
            r3.zzd = r0
            return
    }

    public final int zza() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.zzc
            java.lang.String r1 = "consent_status"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public final com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus zzb() {
            r3 = this;
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r0 = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN
            java.lang.String r0 = r0.name()
            android.content.SharedPreferences r1 = r3.zzc
            java.lang.String r2 = "privacy_options_requirement_status"
            java.lang.String r0 = r1.getString(r2, r0)
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r0 = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.valueOf(r0)
            return r0
    }

    public final java.util.Map zzc() {
            r8 = this;
            android.content.SharedPreferences r0 = r8.zzc
            com.google.android.gms.internal.consent_sdk.zzde r1 = com.google.android.gms.internal.consent_sdk.zzde.zzi()
            java.lang.String r2 = "stored_info"
            java.util.Set r0 = r0.getStringSet(r2, r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L14
            com.google.android.gms.internal.consent_sdk.zzde r0 = com.google.android.gms.internal.consent_sdk.zzap.zza
        L14:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L96
            android.app.Application r2 = r8.zzb
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.internal.consent_sdk.zzcm r4 = com.google.android.gms.internal.consent_sdk.zzco.zza(r2, r3)
            java.lang.String r5 = "UserMessagingPlatform"
            if (r4 != 0) goto L41
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "Fetching request info: failed for key: "
            java.lang.String r2 = r3.concat(r2)
            android.util.Log.d(r5, r2)
            goto L1d
        L41:
            java.lang.String r6 = r4.zza
            r7 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r6, r7)
            java.util.Map r2 = r2.getAll()
            java.lang.String r4 = r4.zzb
            java.lang.Object r2 = r2.get(r4)
            if (r2 != 0) goto L62
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "Stored info not exists: "
            java.lang.String r2 = r3.concat(r2)
            android.util.Log.d(r5, r2)
            goto L1d
        L62:
            boolean r4 = r2 instanceof java.lang.Boolean
            if (r4 == 0) goto L75
            r4 = 1
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r4 == r2) goto L72
            java.lang.String r2 = "0"
            goto L84
        L72:
            java.lang.String r2 = "1"
            goto L84
        L75:
            boolean r4 = r2 instanceof java.lang.Number
            if (r4 == 0) goto L7e
            java.lang.String r2 = r2.toString()
            goto L84
        L7e:
            boolean r4 = r2 instanceof java.lang.String
            if (r4 == 0) goto L88
            java.lang.String r2 = (java.lang.String) r2
        L84:
            r1.put(r3, r2)
            goto L1d
        L88:
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "Failed to fetch stored info: "
            java.lang.String r2 = r3.concat(r2)
            android.util.Log.d(r5, r2)
            goto L1d
        L96:
            return r1
    }

    public final java.util.Set zzd() {
            r1 = this;
            java.util.Set r0 = r1.zzd
            return r0
    }

    public final void zze() {
            r2 = this;
            android.app.Application r0 = r2.zzb
            java.util.Set r1 = r2.zzd
            com.google.android.gms.internal.consent_sdk.zzco.zzb(r0, r1)
            java.util.Set r0 = r2.zzd
            r0.clear()
            android.content.SharedPreferences r0 = r2.zzc
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "stored_info"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            java.lang.String r1 = "consent_status"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            java.lang.String r1 = "consent_type"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            java.lang.String r1 = "privacy_options_requirement_status"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            java.lang.String r1 = "is_pub_misconfigured"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            java.lang.String r1 = "written_values"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            r0.apply()
            return
    }

    public final void zzf() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.zzc
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.util.Set r1 = r3.zzd
            java.lang.String r2 = "written_values"
            android.content.SharedPreferences$Editor r0 = r0.putStringSet(r2, r1)
            r0.apply()
            return
    }

    public final void zzg(int r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.zzc
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "consent_status"
            android.content.SharedPreferences$Editor r3 = r0.putInt(r1, r3)
            r3.apply()
            return
    }

    public final void zzh(boolean r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.zzc
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "is_pub_misconfigured"
            android.content.SharedPreferences$Editor r3 = r0.putBoolean(r1, r3)
            r3.apply()
            return
    }

    public final void zzi(com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.zzc
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r3 = r3.name()
            java.lang.String r1 = "privacy_options_requirement_status"
            android.content.SharedPreferences$Editor r3 = r0.putString(r1, r3)
            r3.apply()
            return
    }

    public final void zzj(java.util.Set r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.zzc
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "stored_info"
            android.content.SharedPreferences$Editor r3 = r0.putStringSet(r1, r3)
            r3.apply()
            return
    }

    public final boolean zzk() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.zzc
            java.lang.String r1 = "is_pub_misconfigured"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }
}
