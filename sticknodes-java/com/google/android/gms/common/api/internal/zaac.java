package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zaac implements com.google.android.gms.tasks.OnCompleteListener {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zaad zab;

    zaac(com.google.android.gms.common.api.internal.zaad r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zab = r1
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(com.google.android.gms.tasks.Task r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zaad r2 = r1.zab
            java.util.Map r2 = com.google.android.gms.common.api.internal.zaad.zab(r2)
            com.google.android.gms.tasks.TaskCompletionSource r0 = r1.zaa
            r2.remove(r0)
            return
    }
}
