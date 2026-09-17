package com.google.android.gms.common.moduleinstall;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
public final class ModuleInstallRequest {
    private final java.util.List zaa;
    private final com.google.android.gms.common.moduleinstall.InstallStatusListener zab;
    private final java.util.concurrent.Executor zac;

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public static class Builder {
        private final java.util.List zaa;
        private com.google.android.gms.common.moduleinstall.InstallStatusListener zab;
        private java.util.concurrent.Executor zac;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.zaa = r0
                return
        }

        public com.google.android.gms.common.moduleinstall.ModuleInstallRequest.Builder addApi(com.google.android.gms.common.api.OptionalModuleApi r2) {
                r1 = this;
                java.util.List r0 = r1.zaa
                r0.add(r2)
                return r1
        }

        public com.google.android.gms.common.moduleinstall.ModuleInstallRequest build() {
                r7 = this;
                com.google.android.gms.common.moduleinstall.ModuleInstallRequest r6 = new com.google.android.gms.common.moduleinstall.ModuleInstallRequest
                java.util.List r1 = r7.zaa
                com.google.android.gms.common.moduleinstall.InstallStatusListener r2 = r7.zab
                java.util.concurrent.Executor r3 = r7.zac
                r4 = 1
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }

        public com.google.android.gms.common.moduleinstall.ModuleInstallRequest.Builder setListener(com.google.android.gms.common.moduleinstall.InstallStatusListener r2) {
                r1 = this;
                r0 = 0
                com.google.android.gms.common.moduleinstall.ModuleInstallRequest$Builder r2 = r1.setListener(r2, r0)
                return r2
        }

        public com.google.android.gms.common.moduleinstall.ModuleInstallRequest.Builder setListener(com.google.android.gms.common.moduleinstall.InstallStatusListener r1, java.util.concurrent.Executor r2) {
                r0 = this;
                r0.zab = r1
                r0.zac = r2
                return r0
        }
    }

    /* synthetic */ ModuleInstallRequest(java.util.List r1, com.google.android.gms.common.moduleinstall.InstallStatusListener r2, java.util.concurrent.Executor r3, boolean r4, com.google.android.gms.common.moduleinstall.zac r5) {
            r0 = this;
            r0.<init>()
            java.lang.String r4 = "APIs must not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r4)
            boolean r4 = r1.isEmpty()
            r4 = r4 ^ 1
            java.lang.String r5 = "APIs must not be empty."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r4, r5)
            if (r3 == 0) goto L1a
            java.lang.String r4 = "Listener must not be null when listener executor is set."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r4)
        L1a:
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            return
    }

    public static com.google.android.gms.common.moduleinstall.ModuleInstallRequest.Builder newBuilder() {
            com.google.android.gms.common.moduleinstall.ModuleInstallRequest$Builder r0 = new com.google.android.gms.common.moduleinstall.ModuleInstallRequest$Builder
            r0.<init>()
            return r0
    }

    public java.util.List<com.google.android.gms.common.api.OptionalModuleApi> getApis() {
            r1 = this;
            java.util.List r0 = r1.zaa
            return r0
    }

    public com.google.android.gms.common.moduleinstall.InstallStatusListener getListener() {
            r1 = this;
            com.google.android.gms.common.moduleinstall.InstallStatusListener r0 = r1.zab
            return r0
    }

    public java.util.concurrent.Executor getListenerExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.zac
            return r0
    }
}
