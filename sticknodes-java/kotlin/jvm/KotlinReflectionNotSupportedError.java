package kotlin.jvm;

/* compiled from: KotlinReflectionNotSupportedError.kt */
/* loaded from: classes2.dex */
public class KotlinReflectionNotSupportedError extends java.lang.Error {
    public KotlinReflectionNotSupportedError() {
            r1 = this;
            java.lang.String r0 = "Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath"
            r1.<init>(r0)
            return
    }
}
