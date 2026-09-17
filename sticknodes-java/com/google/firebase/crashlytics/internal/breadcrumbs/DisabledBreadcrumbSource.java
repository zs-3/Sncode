package com.google.firebase.crashlytics.internal.breadcrumbs;

/* loaded from: classes2.dex */
public class DisabledBreadcrumbSource implements com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource {
    public DisabledBreadcrumbSource() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void registerBreadcrumbHandler(com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler r2) {
            r1 = this;
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r0 = "Could not register handler for breadcrumbs events."
            r2.d(r0)
            return
    }
}
