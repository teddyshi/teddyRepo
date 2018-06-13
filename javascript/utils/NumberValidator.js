"use strict";
var NumberValidator = 
{
		
		validate: function(value, options){
			var oDefaultOptions = {
				maxDigits: 9,
				maxDecimals: 2,
				condition: "POSITIVE_ZERO_NEGATIVE", //options: ONLY_POSITIVE, ONLY_NEGATIVE, ZERO_POSITIVE, ZERO_NEGATIVE, POSITIVE_ZERO_NEGATIVE, POSITIVE_NEGATIVE
				allowScientificNotation : true,
				maxDigitsForSN: 1 // default maxDigits for ScientificNotation
			};
			
			var _options = oDefaultOptions;
			if(undefined !== options){
				for(var i in oDefaultOptions){
					if(undefined !== options[i]){
						//maxDigits should be 1 at least.
						_options[i] =  i === "maxDigits" && options[i] < 1 ? 1 : options[i];	
					}
				}
			}
			
			var sConditionPrefix= "^";
			var sConditionFactor = "";
			if(_options.condition === "ONLY_POSITIVE"){
				sConditionFactor = "[+]?(?!0*[.,]0*$|[.,]0*$|0*$)";
			}else if(_options.condition === "ONLY_NEGATIVE"){
				sConditionFactor = "[-]{1}(?!0*[.,]0*$|[.,]0*$|0*$)";
			}else if(_options.condition === "ZERO_POSITIVE"){
				sConditionFactor = "[+]?";
			}else if(_options.condition === "ZERO_NEGATIVE"){
				sConditionFactor = "[-]?[0]{0," + _options.maxDigits + "}[,.]?[0]{0," + _options.maxDecimals + "}$|^[-]{1}";
			}else if(_options.condition === "POSITIVE_ZERO_NEGATIVE"){
				sConditionFactor = "[+-]?";
			}else if(_options.condition === "POSITIVE_NEGATIVE"){
				sConditionFactor = "[+-]?(?!0*[.,]0*$|[.,]0*$|0*$)";
			}
			else{
				// no validation condition,return false.
				return false;
			}
			var sSNFactor = _options.allowScientificNotation? "(?:[eE][+-]?\\d{0," + _options.maxDigitsForSN + "})?" : "";
			var sDigitsFactor = "";
			if(_options.maxDecimals !== 0){
				sDigitsFactor = "\\d{1," + _options.maxDigits + "}(" + sSNFactor+ "$|[,.]\\d{1," + _options.maxDecimals + "}" +sSNFactor+ "$)";
				//[,.]?\\d{0," + _options.maxDecimals + "}";
			}else{
				sDigitsFactor = "\\d{1," + _options.maxDigits + "}[,.]{0}" + sSNFactor + "$";
			}
			
			var regexPartsArray = [];
			regexPartsArray.push(sConditionPrefix);
			regexPartsArray.push(sConditionFactor);
			regexPartsArray.push(sDigitsFactor);
		//	regexPartsArray.push(sSNFactor);
		//	regexPartsArray.push("$");
			var sRegex = "";
			for(var k = 0 ; k < regexPartsArray.length; k++){
				sRegex += regexPartsArray[k];
			}
			var regex = new RegExp(sRegex);
			return regex.test(value);
		}		
	};
