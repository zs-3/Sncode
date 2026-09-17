package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public class AccountTransferClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.auth.api.accounttransfer.zzr> {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.common.api.Api.ClientKey zzb = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzc = null;
    private static final com.google.android.gms.common.api.Api zzd = null;

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzb = r0
            com.google.android.gms.auth.api.accounttransfer.zzb r1 = new com.google.android.gms.auth.api.accounttransfer.zzb
            r1.<init>()
            com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzc = r1
            com.google.android.gms.common.api.Api r2 = new com.google.android.gms.common.api.Api
            java.lang.String r3 = "AccountTransfer.ACCOUNT_TRANSFER_API"
            r2.<init>(r3, r1, r0)
            com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzd = r2
            return
    }

    AccountTransferClient(android.app.Activity r4, com.google.android.gms.auth.api.accounttransfer.zzr r5) {
            r3 = this;
            com.google.android.gms.common.api.Api r5 = com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzd
            com.google.android.gms.auth.api.accounttransfer.zzr r0 = com.google.android.gms.auth.api.accounttransfer.zzr.zza
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r1 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r1.<init>()
            com.google.android.gms.common.api.internal.ApiExceptionMapper r2 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r2.<init>()
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r1 = r1.setMapper(r2)
            com.google.android.gms.common.api.GoogleApi$Settings r1 = r1.build()
            r3.<init>(r4, r5, r0, r1)
            return
    }

    AccountTransferClient(android.content.Context r4, com.google.android.gms.auth.api.accounttransfer.zzr r5) {
            r3 = this;
            com.google.android.gms.common.api.Api r5 = com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzd
            com.google.android.gms.auth.api.accounttransfer.zzr r0 = com.google.android.gms.auth.api.accounttransfer.zzr.zza
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r1 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r1.<init>()
            com.google.android.gms.common.api.internal.ApiExceptionMapper r2 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r2.<init>()
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r1 = r1.setMapper(r2)
            com.google.android.gms.common.api.GoogleApi$Settings r1 = r1.build()
            r3.<init>(r4, r5, r0, r1)
            return
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.accounttransfer.DeviceMetaData> getDeviceMetaData(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.internal.auth.zzaq r0 = new com.google.android.gms.internal.auth.zzaq
            r0.<init>(r3)
            com.google.android.gms.auth.api.accounttransfer.zzg r3 = new com.google.android.gms.auth.api.accounttransfer.zzg
            r1 = 1608(0x648, float:2.253E-42)
            r3.<init>(r2, r1, r0)
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> notifyCompletion(java.lang.String r2, int r3) {
            r1 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.internal.auth.zzav r0 = new com.google.android.gms.internal.auth.zzav
            r0.<init>(r2, r3)
            com.google.android.gms.auth.api.accounttransfer.zzi r2 = new com.google.android.gms.auth.api.accounttransfer.zzi
            r3 = 1610(0x64a, float:2.256E-42)
            r2.<init>(r1, r3, r0)
            com.google.android.gms.tasks.Task r2 = r1.doWrite(r2)
            return r2
    }

    public com.google.android.gms.tasks.Task<byte[]> retrieveData(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.internal.auth.zzax r0 = new com.google.android.gms.internal.auth.zzax
            r0.<init>(r3)
            com.google.android.gms.auth.api.accounttransfer.zze r3 = new com.google.android.gms.auth.api.accounttransfer.zze
            r1 = 1607(0x647, float:2.252E-42)
            r3.<init>(r2, r1, r0)
            com.google.android.gms.tasks.Task r3 = r2.doRead(r3)
            return r3
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> sendData(java.lang.String r2, byte[] r3) {
            r1 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.internal.auth.zzaz r0 = new com.google.android.gms.internal.auth.zzaz
            r0.<init>(r2, r3)
            com.google.android.gms.auth.api.accounttransfer.zzc r2 = new com.google.android.gms.auth.api.accounttransfer.zzc
            r3 = 1606(0x646, float:2.25E-42)
            r2.<init>(r1, r3, r0)
            com.google.android.gms.tasks.Task r2 = r1.doWrite(r2)
            return r2
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> showUserChallenge(java.lang.String r2, android.app.PendingIntent r3) {
            r1 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.internal.auth.zzbb r0 = new com.google.android.gms.internal.auth.zzbb
            r0.<init>(r2, r3)
            com.google.android.gms.auth.api.accounttransfer.zzh r2 = new com.google.android.gms.auth.api.accounttransfer.zzh
            r3 = 1609(0x649, float:2.255E-42)
            r2.<init>(r1, r3, r0)
            com.google.android.gms.tasks.Task r2 = r1.doWrite(r2)
            return r2
    }
}
