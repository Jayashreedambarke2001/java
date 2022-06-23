package corejava;

class SnakeCase
{
 public String camelToSnake(String str)
 {
String stt="";
stt+=Character.toLowerCase(str.charAt(0));

for(int i=1;i<str.length();i++)
{
 char ch=str.charAt(i);
if (Character.isUnicodeIdentifierPart(ch))
{
stt=stt+'_';
 stt=stt+Character.toLowerCase(ch);
 }
else
{
stt=stt+ch;
 }  
}
return stt;
 }
}
