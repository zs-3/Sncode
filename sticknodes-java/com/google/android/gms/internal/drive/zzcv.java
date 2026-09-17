package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzcv extends com.google.android.gms.common.api.internal.UnregisterListenerMethod<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.events.OpenFileCallback> {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzg zzfu;

    zzcv(com.google.android.gms.internal.drive.zzch r1, com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey r2, com.google.android.gms.internal.drive.zzg r3) {
            r0 = this;
            r0.zzfu = r3
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    protected final /* synthetic */ void unregisterListener(com.google.android.gms.common.api.Api.AnyClient r1, com.google.android.gms.tasks.TaskCompletionSource r2) throws android.os.RemoteException {
            r0 = this;
            com.google.android.gms.internal.drive.zzg r1 = r0.zzfu
            boolean r1 = r1.cancel()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.setResult(r1)
            return
    }
}
