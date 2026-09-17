package kotlin.io;

/* compiled from: Utils.kt */
/* loaded from: classes2.dex */
class FilesKt__UtilsKt extends kotlin.io.FilesKt__FileTreeWalkKt {
    public static java.lang.String getExtension(java.io.File r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r0 = 46
            java.lang.String r1 = ""
            java.lang.String r2 = kotlin.text.StringsKt.substringAfterLast(r2, r0, r1)
            return r2
    }
}
