public class Converter {
    public static final String[] asciiTable = {
        "Null",                  // 0
        "StartOfHeading",        // 1
        "StartOfText",           // 2
        "EndOfText",             // 3
        "EndOfTransmission",     // 4
        "Enquiry",               // 5
        "Acknowledge",           // 6
        "Bell",                  // 7
        "Backspace",             // 8
        "Tab",                   // 9
        "LineFeed",              // 10
        "VerticalTab",           // 11
        "FormFeed",              // 12
        "CarriageReturn",        // 13
        "ShiftOut",              // 14
        "ShiftIn",               // 15
        "DataLinkEscape",        // 16
        "DeviceControl1",        // 17
        "DeviceControl2",        // 18
        "DeviceControl3",        // 19
        "DeviceControl4",        // 20
        "NegativeAcknowledge",   // 21
        "SynchronousIdle",       // 22
        "EndOfTransmissionBlock",// 23
        "Cancel",                // 24
        "EndOfMedium",           // 25
        "Substitute",            // 26
        "Escape",                // 27
        "FileSeparator",         // 28
        "GroupSeparator",        // 29
        "RecordSeparator",       // 30
        "UnitSeparator",         // 31
        " ",                     // 32 (Space)
        "!",                     // 33
        "\"",                    // 34
        "#",                     // 35
        "$",                     // 36
        "%",                     // 37
        "&",                     // 38
        "'",                     // 39
        "(",                     // 40
        ")",                     // 41
        "*",                     // 42
        "+",                     // 43
        ",",                     // 44
        "-",                     // 45
        ".",                     // 46
        "/",                     // 47
        "0",                     // 48
        "1",                     // 49
        "2",                     // 50
        "3",                     // 51
        "4",                     // 52
        "5",                     // 53
        "6",                     // 54
        "7",                     // 55
        "8",                     // 56
        "9",                     // 57
        ":",                     // 58
        ";",                     // 59
        "<",                     // 60
        "=",                     // 61
        ">",                     // 62
        "?",                     // 63
        "@",                     // 64
        "A",                     // 65
        "B",                     // 66
        "C",                     // 67
        "D",                     // 68
        "E",                     // 69
        "F",                     // 70
        "G",                     // 71
        "H",                     // 72
        "I",                     // 73
        "J",                     // 74
        "K",                     // 75
        "L",                     // 76
        "M",                     // 77
        "N",                     // 78
        "O",                     // 79
        "P",                     // 80
        "Q",                     // 81
        "R",                     // 82
        "S",                     // 83
        "T",                     // 84
        "U",                     // 85
        "V",                     // 86
        "W",                     // 87
        "X",                     // 88
        "Y",                     // 89
        "Z",                     // 90
        "[",                     // 91
        "\\",                    // 92
        "]",                     // 93
        "^",                     // 94
        "_",                     // 95
        "`",                     // 96
        "a",                     // 97
        "b",                     // 98
        "c",                     // 99
        "d",                     // 100
        "e",                     // 101
        "f",                     // 102
        "g",                     // 103
        "h",                     // 104
        "i",                     // 105
        "j",                     // 106
        "k",                     // 107
        "l",                     // 108
        "m",                     // 109
        "n",                     // 110
        "o",                     // 111
        "p",                     // 112
        "q",                     // 113
        "r",                     // 114
        "s",                     // 115
        "t",                     // 116
        "u",                     // 117
        "v",                     // 118
        "w",                     // 119
        "x",                     // 120
        "y",                     // 121
        "z",                     // 122
        "{",                     // 123
        "|",                     // 124
        "}",                     // 125
        "~",                     // 126
        "Delete"                 // 127
    };

    Converter(){
    }

    public String[] convert(String phrase){
        String[] phrases = phrase.split("");
        String[] allOutputs = new String[phrases.length];
        for(int i = 0; i<phrases.length; ++i){
            allOutputs[i] = turnToBinary(phrases[i]);
        }

        /* 
        String[] allOutputsFlipped = new String[allOutputs.length];
        for(int i = 0; i < allOutputs.length; ++i){
            String oppString = "";
            for(int j = allOutputs[i].length(); j >= 0; --j){
                oppString += allOutputs[i].substring(j, j+1);
            }
            allOutputsFlipped[i] = oppString;
        }
            */
       
        return allOutputs;
    }

    public String turnToBinary(String x){
        int asciiSpot = 0;
        for(int i = 0; i<asciiTable.length; ++i){
            if(x.equals(asciiTable[i])){
                asciiSpot = i;
                break;
            }
        }
        double binarySpot = 0;
        double cnt = -1;
        while(asciiSpot - binarySpot > 0){
            ++cnt;
            binarySpot = Math.pow(2, cnt);
        }
        --cnt;
        String output = "1"; 
        asciiSpot -= Math.pow(2, cnt);
        --cnt;
        binarySpot = Math.pow(2, cnt);

        //////////////////////////////////////////////////////

        while(cnt > -1){
            if(asciiSpot - binarySpot >= 0){
                output += "1";
                asciiSpot -= Math.pow(2, cnt);
                --cnt;
                binarySpot = Math.pow(2, cnt);
            }
            else{
                output += "0";
                --cnt;
                binarySpot = Math.pow(2, cnt);
            }
            
        }
        
        return output;

    }

}

