package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class AccountTransfer {
    public static final java.lang.String ACTION_ACCOUNT_EXPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE";
    public static final java.lang.String ACTION_ACCOUNT_IMPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE";
    public static final java.lang.String ACTION_START_ACCOUNT_EXPORT = "com.google.android.gms.auth.START_ACCOUNT_EXPORT";
    public static final java.lang.String KEY_EXTRA_ACCOUNT_TYPE = "key_extra_account_type";
    public static final com.google.android.gms.common.api.Api zza = null;

    @java.lang.Deprecated
    public static final com.google.android.gms.internal.auth.zzao zzb = null;

    @java.lang.Deprecated
    public static final com.google.android.gms.internal.auth.zzao zzc = null;
    private static final com.google.android.gms.common.api.Api.ClientKey zzd = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zze = null;

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.auth.api.accounttransfer.AccountTransfer.zzd = r0
            com.google.android.gms.auth.api.accounttransfer.zza r1 = new com.google.android.gms.auth.api.accounttransfer.zza
            r1.<init>()
            com.google.android.gms.auth.api.accounttransfer.AccountTransfer.zze = r1
            com.google.android.gms.common.api.Api r2 = new com.google.android.gms.common.api.Api
            java.lang.String r3 = "AccountTransfer.ACCOUNT_TRANSFER_API"
            r2.<init>(r3, r1, r0)
            com.google.android.gms.auth.api.accounttransfer.AccountTransfer.zza = r2
            com.google.android.gms.internal.auth.zzao r0 = new com.google.android.gms.internal.auth.zzao
            r0.<init>()
            com.google.android.gms.auth.api.accounttransfer.AccountTransfer.zzb = r0
            com.google.android.gms.internal.auth.zzao r0 = new com.google.android.gms.internal.auth.zzao
            r0.<init>()
            com.google.android.gms.auth.api.accounttransfer.AccountTransfer.zzc = r0
            return
    }

    private AccountTransfer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.auth.api.accounttransfer.AccountTransferClient getAccountTransferClient(android.app.Activity r2) {
            com.google.android.gms.auth.api.accounttransfer.AccountTransferClient r0 = new com.google.android.gms.auth.api.accounttransfer.AccountTransferClient
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static com.google.android.gms.auth.api.accounttransfer.AccountTransferClient getAccountTransferClient(android.content.Context r2) {
            com.google.android.gms.auth.api.accounttransfer.AccountTransferClient r0 = new com.google.android.gms.auth.api.accounttransfer.AccountTransferClient
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }
}
