package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zabl implements com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener {
    final /* synthetic */ com.google.android.gms.common.api.internal.GoogleApiManager zaa;

    zabl(com.google.android.gms.common.api.internal.GoogleApiManager r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean r4) {
            r3 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r3.zaa
            android.os.Handler r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2 = 1
            android.os.Message r4 = r0.obtainMessage(r2, r4)
            r1.sendMessage(r4)
            return
    }
}
