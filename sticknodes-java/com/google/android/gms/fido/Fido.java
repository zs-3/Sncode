package com.google.android.gms.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public class Fido {
    public static final java.lang.String FIDO2_KEY_CREDENTIAL_EXTRA = "FIDO2_CREDENTIAL_EXTRA";

    @java.lang.Deprecated
    public static final java.lang.String FIDO2_KEY_ERROR_EXTRA = "FIDO2_ERROR_EXTRA";

    @java.lang.Deprecated
    public static final java.lang.String FIDO2_KEY_RESPONSE_EXTRA = "FIDO2_RESPONSE_EXTRA";
    public static final java.lang.String KEY_RESPONSE_EXTRA = "RESPONSE_EXTRA";
    public static final com.google.android.gms.common.api.Api.ClientKey zza = null;
    public static final com.google.android.gms.common.api.Api zzb = null;
    public static final com.google.android.gms.internal.fido.zzaa zzc = null;

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.fido.Fido.zza = r0
            com.google.android.gms.common.api.Api r1 = new com.google.android.gms.common.api.Api
            com.google.android.gms.internal.fido.zzab r2 = new com.google.android.gms.internal.fido.zzab
            r2.<init>()
            java.lang.String r3 = "Fido.U2F_ZERO_PARTY_API"
            r1.<init>(r3, r2, r0)
            com.google.android.gms.fido.Fido.zzb = r1
            com.google.android.gms.internal.fido.zzaa r0 = new com.google.android.gms.internal.fido.zzaa
            r0.<init>()
            com.google.android.gms.fido.Fido.zzc = r0
            return
    }

    private Fido() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.fido.fido2.Fido2ApiClient getFido2ApiClient(android.app.Activity r1) {
            com.google.android.gms.fido.fido2.Fido2ApiClient r0 = new com.google.android.gms.fido.fido2.Fido2ApiClient
            r0.<init>(r1)
            return r0
    }

    public static com.google.android.gms.fido.fido2.Fido2ApiClient getFido2ApiClient(android.content.Context r1) {
            com.google.android.gms.fido.fido2.Fido2ApiClient r0 = new com.google.android.gms.fido.fido2.Fido2ApiClient
            r0.<init>(r1)
            return r0
    }

    public static com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient getFido2PrivilegedApiClient(android.app.Activity r1) {
            com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient r0 = new com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient
            r0.<init>(r1)
            return r0
    }

    public static com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient getFido2PrivilegedApiClient(android.content.Context r1) {
            com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient r0 = new com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient
            r0.<init>(r1)
            return r0
    }

    public static com.google.android.gms.fido.u2f.U2fApiClient getU2fApiClient(android.app.Activity r1) {
            com.google.android.gms.fido.u2f.U2fApiClient r0 = new com.google.android.gms.fido.u2f.U2fApiClient
            r0.<init>(r1)
            return r0
    }

    public static com.google.android.gms.fido.u2f.U2fApiClient getU2fApiClient(android.content.Context r1) {
            com.google.android.gms.fido.u2f.U2fApiClient r0 = new com.google.android.gms.fido.u2f.U2fApiClient
            r0.<init>(r1)
            return r0
    }
}
