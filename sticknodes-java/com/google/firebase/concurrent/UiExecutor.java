package com.google.firebase.concurrent;

/* loaded from: classes2.dex */
public enum UiExecutor extends java.lang.Enum<com.google.firebase.concurrent.UiExecutor> implements java.util.concurrent.Executor {
    private static final /* synthetic */ com.google.firebase.concurrent.UiExecutor[] $VALUES = null;

    @android.annotation.SuppressLint({"ThreadPoolCreation"})
    private static final android.os.Handler HANDLER = null;
    public static final com.google.firebase.concurrent.UiExecutor INSTANCE = null;

    private static /* synthetic */ com.google.firebase.concurrent.UiExecutor[] $values() {
            r0 = 1
            com.google.firebase.concurrent.UiExecutor[] r0 = new com.google.firebase.concurrent.UiExecutor[r0]
            com.google.firebase.concurrent.UiExecutor r1 = com.google.firebase.concurrent.UiExecutor.INSTANCE
            r2 = 0
            r0[r2] = r1
            return r0
    }

    static {
            com.google.firebase.concurrent.UiExecutor r0 = new com.google.firebase.concurrent.UiExecutor
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.firebase.concurrent.UiExecutor.INSTANCE = r0
            com.google.firebase.concurrent.UiExecutor[] r0 = $values()
            com.google.firebase.concurrent.UiExecutor.$VALUES = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.google.firebase.concurrent.UiExecutor.HANDLER = r0
            return
    }

    UiExecutor(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.firebase.concurrent.UiExecutor valueOf(java.lang.String r1) {
            java.lang.Class<com.google.firebase.concurrent.UiExecutor> r0 = com.google.firebase.concurrent.UiExecutor.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.firebase.concurrent.UiExecutor r1 = (com.google.firebase.concurrent.UiExecutor) r1
            return r1
    }

    public static com.google.firebase.concurrent.UiExecutor[] values() {
            com.google.firebase.concurrent.UiExecutor[] r0 = com.google.firebase.concurrent.UiExecutor.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.firebase.concurrent.UiExecutor[] r0 = (com.google.firebase.concurrent.UiExecutor[]) r0
            return r0
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r2) {
            r1 = this;
            android.os.Handler r0 = com.google.firebase.concurrent.UiExecutor.HANDLER
            r0.post(r2)
            return
    }
}
