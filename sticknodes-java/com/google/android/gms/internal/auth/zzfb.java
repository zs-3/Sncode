package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzfb extends java.io.IOException {
    private com.google.android.gms.internal.auth.zzfx zza;

    public zzfb(java.io.IOException r2) {
            r1 = this;
            java.lang.String r0 = r2.getMessage()
            r1.<init>(r0, r2)
            r2 = 0
            r1.zza = r2
            return
    }

    public zzfb(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.zza = r1
            return
    }

    static com.google.android.gms.internal.auth.zzfb zza() {
            com.google.android.gms.internal.auth.zzfb r0 = new com.google.android.gms.internal.auth.zzfb
            java.lang.String r1 = "Protocol message contained an invalid tag (zero)."
            r0.<init>(r1)
            return r0
    }

    static com.google.android.gms.internal.auth.zzfb zzb() {
            com.google.android.gms.internal.auth.zzfb r0 = new com.google.android.gms.internal.auth.zzfb
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            r0.<init>(r1)
            return r0
    }

    static com.google.android.gms.internal.auth.zzfb zzc() {
            com.google.android.gms.internal.auth.zzfb r0 = new com.google.android.gms.internal.auth.zzfb
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r0.<init>(r1)
            return r0
    }

    static com.google.android.gms.internal.auth.zzfb zzd() {
            com.google.android.gms.internal.auth.zzfb r0 = new com.google.android.gms.internal.auth.zzfb
            java.lang.String r1 = "Failed to parse the message."
            r0.<init>(r1)
            return r0
    }

    static com.google.android.gms.internal.auth.zzfb zzf() {
            com.google.android.gms.internal.auth.zzfb r0 = new com.google.android.gms.internal.auth.zzfb
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            return r0
    }

    public final com.google.android.gms.internal.auth.zzfb zze(com.google.android.gms.internal.auth.zzfx r1) {
            r0 = this;
            r0.zza = r1
            return r0
    }
}
