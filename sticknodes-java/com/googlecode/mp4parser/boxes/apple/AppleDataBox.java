package com.googlecode.mp4parser.boxes.apple;

/* loaded from: classes2.dex */
public abstract class AppleDataBox extends com.googlecode.mp4parser.AbstractBox {
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    private static java.util.HashMap<java.lang.String, java.lang.String> language;
    int dataCountry;
    int dataLanguage;
    int dataType;

    static {
            ajc$preClinit()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.googlecode.mp4parser.boxes.apple.AppleDataBox.language = r0
            java.lang.String r1 = "0"
            java.lang.String r2 = "English"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "1"
            java.lang.String r2 = "French"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "2"
            java.lang.String r2 = "German"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "3"
            java.lang.String r2 = "Italian"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "4"
            java.lang.String r2 = "Dutch"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "5"
            java.lang.String r2 = "Swedish"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "6"
            java.lang.String r2 = "Spanish"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "7"
            java.lang.String r2 = "Danish"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "8"
            java.lang.String r2 = "Portuguese"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "9"
            java.lang.String r2 = "Norwegian"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "10"
            java.lang.String r2 = "Hebrew"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "11"
            java.lang.String r2 = "Japanese"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "12"
            java.lang.String r2 = "Arabic"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "13"
            java.lang.String r2 = "Finnish"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "14"
            java.lang.String r2 = "Greek"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "15"
            java.lang.String r2 = "Icelandic"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "16"
            java.lang.String r2 = "Maltese"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "17"
            java.lang.String r2 = "Turkish"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "18"
            java.lang.String r2 = "Croatian"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "19"
            java.lang.String r2 = "Traditional_Chinese"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "20"
            java.lang.String r2 = "Urdu"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "21"
            java.lang.String r2 = "Hindi"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "22"
            java.lang.String r2 = "Thai"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "23"
            java.lang.String r2 = "Korean"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "24"
            java.lang.String r2 = "Lithuanian"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "25"
            java.lang.String r2 = "Polish"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "26"
            java.lang.String r2 = "Hungarian"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "27"
            java.lang.String r2 = "Estonian"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "28"
            java.lang.String r2 = "Lettish"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "29"
            java.lang.String r2 = "Sami"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "30"
            java.lang.String r2 = "Faroese"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "31"
            java.lang.String r2 = "Farsi"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "32"
            java.lang.String r2 = "Russian"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "33"
            java.lang.String r2 = "Simplified_Chinese"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "34"
            java.lang.String r2 = "Flemish"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "35"
            java.lang.String r2 = "Irish"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "36"
            java.lang.String r2 = "Albanian"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "37"
            java.lang.String r2 = "Romanian"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "38"
            java.lang.String r2 = "Czech"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "39"
            java.lang.String r2 = "Slovak"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "40"
            java.lang.String r2 = "Slovenian"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "41"
            java.lang.String r2 = "Yiddish"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "42"
            java.lang.String r2 = "Serbian"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "43"
            java.lang.String r2 = "Macedonian"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "44"
            java.lang.String r2 = "Bulgarian"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "45"
            java.lang.String r2 = "Ukrainian"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "46"
            java.lang.String r2 = "Belarusian"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "47"
            java.lang.String r2 = "Uzbek"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "48"
            java.lang.String r2 = "Kazakh"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "49"
            java.lang.String r2 = "Azerbaijani"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "50"
            java.lang.String r2 = "AzerbaijanAr"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "51"
            java.lang.String r2 = "Armenian"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "52"
            java.lang.String r2 = "Georgian"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "53"
            java.lang.String r2 = "Moldavian"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "54"
            java.lang.String r2 = "Kirghiz"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "55"
            java.lang.String r2 = "Tajiki"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "56"
            java.lang.String r2 = "Turkmen"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "57"
            java.lang.String r2 = "Mongolian"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "58"
            java.lang.String r2 = "MongolianCyr"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "59"
            java.lang.String r2 = "Pashto"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "60"
            java.lang.String r2 = "Kurdish"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "61"
            java.lang.String r2 = "Kashmiri"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "62"
            java.lang.String r2 = "Sindhi"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "63"
            java.lang.String r2 = "Tibetan"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "64"
            java.lang.String r2 = "Nepali"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "65"
            java.lang.String r2 = "Sanskrit"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "66"
            java.lang.String r2 = "Marathi"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "67"
            java.lang.String r2 = "Bengali"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "68"
            java.lang.String r2 = "Assamese"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "69"
            java.lang.String r2 = "Gujarati"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "70"
            java.lang.String r2 = "Punjabi"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "71"
            java.lang.String r2 = "Oriya"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "72"
            java.lang.String r2 = "Malayalam"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "73"
            java.lang.String r2 = "Kannada"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "74"
            java.lang.String r2 = "Tamil"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "75"
            java.lang.String r2 = "Telugu"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "76"
            java.lang.String r2 = "Sinhala"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "77"
            java.lang.String r2 = "Burmese"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "78"
            java.lang.String r2 = "Khmer"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "79"
            java.lang.String r2 = "Lao"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "80"
            java.lang.String r2 = "Vietnamese"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "81"
            java.lang.String r2 = "Indonesian"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "82"
            java.lang.String r2 = "Tagalog"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "83"
            java.lang.String r2 = "MalayRoman"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "84"
            java.lang.String r2 = "MalayArabic"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "85"
            java.lang.String r2 = "Amharic"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "87"
            java.lang.String r2 = "Galla"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r2 = "Oromo"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "88"
            java.lang.String r2 = "Somali"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "89"
            java.lang.String r2 = "Swahili"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "90"
            java.lang.String r2 = "Kinyarwanda"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "91"
            java.lang.String r2 = "Rundi"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "92"
            java.lang.String r2 = "Nyanja"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "93"
            java.lang.String r2 = "Malagasy"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "94"
            java.lang.String r2 = "Esperanto"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "128"
            java.lang.String r2 = "Welsh"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "129"
            java.lang.String r2 = "Basque"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "130"
            java.lang.String r2 = "Catalan"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "131"
            java.lang.String r2 = "Latin"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "132"
            java.lang.String r2 = "Quechua"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "133"
            java.lang.String r2 = "Guarani"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "134"
            java.lang.String r2 = "Aymara"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "135"
            java.lang.String r2 = "Tatar"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "136"
            java.lang.String r2 = "Uighur"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "137"
            java.lang.String r2 = "Dzongkha"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "138"
            java.lang.String r2 = "JavaneseRom"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.String r1 = "32767"
            java.lang.String r2 = "Unspecified"
            r0.put(r1, r2)
            return
    }

    protected AppleDataBox(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.dataType = r2
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.apple.AppleDataBox> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.class
            java.lang.String r1 = "AppleDataBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getLanguageString"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.AppleDataBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 25
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.AppleDataBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDataType"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.AppleDataBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 43
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.AppleDataBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDataCountry"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.AppleDataBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 47
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.AppleDataBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDataCountry"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.AppleDataBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "dataCountry"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 51
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.AppleDataBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDataLanguage"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.AppleDataBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 55
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.AppleDataBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDataLanguage"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.AppleDataBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "dataLanguage"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 59
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.AppleDataBox.ajc$tjp_5 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(java.nio.ByteBuffer r1) {
            r0 = this;
            java.nio.ByteBuffer r1 = r0.parseDataLength4ccTypeCountryLanguageAndReturnRest(r1)
            r0.parseData(r1)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r2) {
            r1 = this;
            r1.writeDataLength4ccTypeCountryLanguage(r2)
            byte[] r0 = r1.writeData()
            r2.put(r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            int r0 = r2.getDataLength()
            int r0 = r0 + 16
            long r0 = (long) r0
            return r0
    }

    public int getDataCountry() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.dataCountry
            return r0
    }

    public int getDataLanguage() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.dataLanguage
            return r0
    }

    protected abstract int getDataLength();

    public int getDataType() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.dataType
            return r0
    }

    public java.lang.String getLanguageString() {
            r3 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r3, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.language
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r3.dataLanguage
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L41
            r0 = 2
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            int r1 = r3.dataLanguage
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r1)
            r0.reset()
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r0 = com.coremedia.iso.IsoTypeReader.readIso639(r0)
            r1.<init>(r0)
            java.lang.String r0 = r1.getDisplayLanguage()
        L41:
            return r0
    }

    protected abstract void parseData(java.nio.ByteBuffer r1);

    @com.googlecode.mp4parser.annotations.DoNotParseDetail
    protected java.nio.ByteBuffer parseDataLength4ccTypeCountryLanguageAndReturnRest(java.nio.ByteBuffer r4) {
            r3 = this;
            int r0 = r4.getInt()
            r4.getInt()
            int r1 = r4.getInt()
            r3.dataType = r1
            short r1 = r4.getShort()
            r3.dataCountry = r1
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r1 >= 0) goto L1a
            int r1 = r1 + r2
            r3.dataCountry = r1
        L1a:
            short r1 = r4.getShort()
            r3.dataLanguage = r1
            if (r1 >= 0) goto L25
            int r1 = r1 + r2
            r3.dataLanguage = r1
        L25:
            java.nio.ByteBuffer r1 = r4.duplicate()
            java.nio.ByteBuffer r1 = r1.slice()
            int r0 = r0 + (-16)
            java.nio.Buffer r1 = r1.limit(r0)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r2 = r4.position()
            int r0 = r0 + r2
            r4.position(r0)
            return r1
    }

    public void setDataCountry(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.ajc$tjp_3
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.dataCountry = r3
            return
    }

    public void setDataLanguage(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.AppleDataBox.ajc$tjp_5
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.dataLanguage = r3
            return
    }

    protected abstract byte[] writeData();

    @com.googlecode.mp4parser.annotations.DoNotParseDetail
    protected void writeDataLength4ccTypeCountryLanguage(java.nio.ByteBuffer r2) {
            r1 = this;
            int r0 = r1.getDataLength()
            int r0 = r0 + 16
            r2.putInt(r0)
            java.lang.String r0 = "data"
            byte[] r0 = r0.getBytes()
            r2.put(r0)
            int r0 = r1.dataType
            r2.putInt(r0)
            int r0 = r1.dataCountry
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r2, r0)
            int r0 = r1.dataLanguage
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r2, r0)
            return
    }
}
