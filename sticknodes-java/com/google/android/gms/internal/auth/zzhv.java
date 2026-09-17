package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzhv implements com.google.android.gms.internal.auth.zzhu {
    public static final com.google.android.gms.internal.auth.zzdc zza = null;
    public static final com.google.android.gms.internal.auth.zzdc zzb = null;
    public static final com.google.android.gms.internal.auth.zzdc zzc = null;
    public static final com.google.android.gms.internal.auth.zzdc zzd = null;
    public static final com.google.android.gms.internal.auth.zzdc zze = null;

    static {
            com.google.android.gms.internal.auth.zzcz r0 = new com.google.android.gms.internal.auth.zzcz
            java.lang.String r1 = "com.google.android.gms.auth_account"
            android.net.Uri r1 = com.google.android.gms.internal.auth.zzcr.zza(r1)
            r0.<init>(r1)
            com.google.android.gms.internal.auth.zzcz r0 = r0.zzb()
            com.google.android.gms.internal.auth.zzcz r0 = r0.zza()
            java.lang.String r1 = "Aang__create_auth_exception_with_pending_intent"
            r2 = 0
            com.google.android.gms.internal.auth.zzdc r1 = r0.zze(r1, r2)
            com.google.android.gms.internal.auth.zzhv.zza = r1
            java.lang.String r1 = "Aang__enable_add_account_restrictions"
            com.google.android.gms.internal.auth.zzdc r1 = r0.zze(r1, r2)
            com.google.android.gms.internal.auth.zzhv.zzb = r1
            java.lang.String r1 = "Aang__log_missing_gaia_id_event"
            r3 = 1
            com.google.android.gms.internal.auth.zzdc r1 = r0.zze(r1, r3)
            com.google.android.gms.internal.auth.zzhv.zzc = r1
            java.lang.String r1 = "Aang__log_obfuscated_gaiaid_status"
            com.google.android.gms.internal.auth.zzdc r1 = r0.zze(r1, r3)
            com.google.android.gms.internal.auth.zzhv.zzd = r1
            java.lang.String r1 = "Aang__switch_clear_token_to_aang"
            com.google.android.gms.internal.auth.zzdc r0 = r0.zze(r1, r2)
            com.google.android.gms.internal.auth.zzhv.zze = r0
            return
    }

    public zzhv() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.auth.zzhu
    public final boolean zza() {
            r1 = this;
            com.google.android.gms.internal.auth.zzdc r0 = com.google.android.gms.internal.auth.zzhv.zza
            java.lang.Object r0 = r0.zzb()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }
}
